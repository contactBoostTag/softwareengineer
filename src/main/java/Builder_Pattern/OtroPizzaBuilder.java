/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_Pattern;

/**
 *
 * @author Romell
 */
abstract class OtroPizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }
    public void crearNuevaPizza() {
           pizza = new Pizza();
           buildMasa();
           buildSalsa();
           buildRelleno();
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}