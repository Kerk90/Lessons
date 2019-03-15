/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template4;

import Template2.Tea;

/**
 *
 * @author user
 */
public class Barista {

    public static void main(String[] args) {
        HotDrink tea = new Tea();

        System.out.println("Making tea...");
        System.out.println("==============");
        tea.prepareRecipe();

        HotDrink coffee = new Coffee();
        System.out.println("Making coffee...");
        System.out.println("===============");
        coffee.prepareRecipe();
    }
}
