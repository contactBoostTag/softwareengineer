/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_Pattern;

/**
 *
 * @author Romell
 */
/** "ConcreteBuilder" */
class HawaiPizzaBuilder extends PizzaBuilder {
    public void buildMasa()   { pizza.setMasa("suave"); }
    public void buildSalsa()   { pizza.setSalsa("dulce"); }
    public void buildRelleno() { pizza.setRelleno("chorizo+alcachofas"); }

    @Override
    public String toString(){
        return "Pizza Hawai hecha de  "+pizza.getMasa()+" "+pizza.getSalsa()+" de "+pizza.getRelleno();
    }
}