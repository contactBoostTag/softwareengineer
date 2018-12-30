/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Flyweight_Pattern;

/**
 *
 * @author Romell
 */
// ConcreteFlyweight object that creates ConcreteFlyweight
public class CoffeeFlavor implements CoffeeOrder {
    private String flavor;

    public CoffeeFlavor(String newFlavor) {
        flavor = newFlavor;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void serveCoffee(CoffeeOrderContext context) {
        System.out.println("Serving Coffee flavor " + flavor + " to table number " + context.getTable());
    }
}