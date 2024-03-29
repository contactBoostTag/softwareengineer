/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_Pattern;

/**
 *
 * @author Romell
 */

/** Un cliente pidiendo una pizza. */
class BuilderExample {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();

        cocina.setPizzaBuilder( hawai_pizzabuilder );
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();

        cocina.setPizzaBuilder(picante_pizzabuilder);
        cocina.construirPizza();
        pizza = cocina.getPizza();
    }
}