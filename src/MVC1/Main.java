/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1;

import MVC1.Controller.Controller;
import MVC1.Controller.DefaultController;
import MVC1.Controller.DoNothingController;
import MVC1.model.Model;
import java.util.Objects;
import javax.swing.text.View;
import static org.omg.CORBA.ORB.init;

public class Main {
   private Model model;
    private View view;
    private Controller controller;
    private Main(Model model, View view, Controller controller) {
        this.model = model;
        this.view = view;
        this.controller = controller;
        init();
    }
    public static void main(String[] args) {
        Controller controller = makeController(args);
        Main main = new Main(new Model(), new SwungView(), controller);
        main.start();
    }
    static Controller makeController(String... args) {
        Controller controller = new DefaultController();
        for (String arg : args) {
            if (Objects.equals(arg, "-nothing")) {
                controller = new DoNothingController();                
            }
        }
        return controller;
    }
    void start() {
        controller.start();
    }
    private void init() {
        view.setModel(model);
        view.setController(controller);
        controller.setView(view);
        controller.setModel(model);
    }
}
 

