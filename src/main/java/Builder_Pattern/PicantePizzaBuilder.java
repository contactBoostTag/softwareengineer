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
class PicantePizzaBuilder extends PizzaBuilder {
    public void buildMasa()   { pizza.setMasa("cocida"); }
    public void buildSalsa()   { pizza.setSalsa("picante"); }
    public void buildRelleno() { pizza.setRelleno("pimienta+salchichón"); }

    @Override
    public String toString(){
        return "Pizza Hawai hecha de  "+pizza.getMasa()+" "+pizza.getSalsa()+" de "+pizza.getRelleno();
    }
    
}