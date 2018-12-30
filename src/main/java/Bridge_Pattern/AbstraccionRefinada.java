/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bridge_Pattern;

/**
 *
 * @author Romell
 */
/** clase refinada que implementa la abstraccion **/
public class AbstraccionRefinada implements Abstraccion{
    private Implementador implementador;
    public AbstraccionRefinada(Implementador implementador){
        this.implementador = implementador;
    }
    public void operacion(){
        implementador.operacion();
    }
}