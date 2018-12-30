/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bridge_Pattern;

/**
 *
 * @author Romell
 */
/** aplicacion que usa el patrón Bridge **/
public class EjemploBridge {
    public static void main(String[] args) {
        Abstraccion[] abstracciones = new Abstraccion[2];
        abstracciones[0] = new AbstraccionRefinada(new ImplementacionA());
        abstracciones[1] = new AbstraccionRefinada(new ImplementacionB());
        for(Abstraccion abstraccion:abstracciones)
            abstraccion.operacion();
    }
}