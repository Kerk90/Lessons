/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy2;
//import javax.awt.*;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.*;


/**
 *
 * @author user
 */
public class ImageComponent extends JComponent{
    private static final long serialVersionUID=1L;
    private Icon icon;
    public ImageComponent(Icon icon){
        this.icon=icon;
    }
public void setIcon(Icon icon){
    this.icon=icon;
}
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    int w = icon.getIconWidth();
    int h = icon.getIconHeight();
    int x = (800 - w)/2;
    int y = (600 - h)/2;
            icon.paintIcon(this, g, x, y);
}
}
