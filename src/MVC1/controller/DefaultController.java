/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.controller;

import MVC1.model.Model;
import javax.swing.text.View;

public class DefaultController extends AbstractController{
    @Override
    public void addAction(String text){
        model.addDatum(text);
    }
    @Override
    public void removeAction(String text){
        model.removeDatum(text);
    }        
}
