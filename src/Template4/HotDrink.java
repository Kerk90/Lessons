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
public abstract class HotDrink {

    final void prepareReciple() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsIngridients()) {
            addIngridients();
        }
    }

    abstract void brew();

    abstract void addIngridients();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");

    }

    boolean customerWantsIngridients() {
        return true;
    }

    void prepareRecipe() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
