/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_Pattern;

/**
 *
 * @author Romell
 */
/** "Director" */
class OtraCocina {
    private OtroPizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(OtroPizzaBuilder pb) { pizzaBuilder = pb; }
    public Pizza getPizza() { return pizzaBuilder.getPizza(); }

    public void construirPizza() {
       pizzaBuilder.crearNuevaPizza();
       //notar que no se necesita llamar a cada build.
    }
}