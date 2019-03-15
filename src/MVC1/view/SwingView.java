/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.view;

import MVC1.model.Model;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractListModel;

//import javax.swing.*
import MVC1.Controller.Controller;
import MVC1.model.Model;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.View;

public class SwingView implements ActionListener, View {

    private JFrame frame;
    private JList<String> list;
    private JButton add;
    private JButton remove;
    private JTextField field;
    private Controller controller;

    public SwingView() {
        initComponents();
    }

    public void actionPerfomed(ActionEvent e) {
        if (e.getSource() == add) {
            controller.addAction(field.getText());
        } else if (e.getSource() == remove) {
            controller.removeAction(list.getSelectedValue());
            list.clearSelection();
        }
    }

    public void dispose() {
        frame.dispose();
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        list.setModel(new ModelWrapper(model));
    }

    public void show() {
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }

    private void initComponents() {
        frame = new JFrame("List");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        frame.setSize(new Dimension(500, 150));
        frame.setContentPane(mainPanel);
        list = createList();
        mainPanel.add(list);
        field = createField();
        mainPanel.add(field);
        add = createButton("Add");
        mainPanel.add(add);
        remove = createButton("Remove");
        mainPanel.add(remove);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        button.setEnabled(false);
        return button;
    }

    private JTextField createField() {
        JTextField textField = new JTextField(15);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateAddButtonState();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateAddButtonState();
            }

            @Override
            public void removedUpdate(DocumentEvent e) {
                updateAddButtonState();
            }

            @Override
            public void updatedAddButton() {
                add.setEnabled(!field.getText().isEmpty());
            }
        });
        return textField;
    }

    private JList<String> createList() {
        JList<String> jList = new JList<>();
        jList.setPreferredSize(new Dimention(100, 100));
        jList.addListSelectionListener(e -> remove.setEnabled(!list.isSelectionEmpty()));
        return jList;
    }

    private class ModelWrapper extends AbstractListModel<String> implements Observer {

        private Model model;

        public ModelWrapper(Model model) {
            this.model = model;
            model.addObserver(this);
        }

        public String getElementAs(int index) {
            return model.get(index);
        }

        @Override
        public int getSize() {
            return model.size();
        }

        @Override
        public void update(Observable o, Object arg) {
            fireContentsChabged(this, o, model.size());
        }
    }
}
