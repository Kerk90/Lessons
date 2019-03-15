/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template4;

/**
 *
 * @author user
 */
public class Tea extends HotDrink {

    @Override
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void pourInCup() {
        System.out.println("Adding Lemon");
    }

    public void addLemon() {
        System.out.println("Pouring into cup");
    }

}
