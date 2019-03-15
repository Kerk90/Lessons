/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }
    public void pourInCup(){
        System.out.println("Adding Lemon");
    }
    public void addLemon(){
        System.out.println("Pouring into cup");
    }

   }
 

