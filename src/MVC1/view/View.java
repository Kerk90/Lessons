/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.view;

import MVC1.Controller.Controller;
import MVC1.model.Model;

public interface View {
        void dispose() {
        void setController(Controller controller);           
       void setModel(Model model);               
       void show();        
   }
}


