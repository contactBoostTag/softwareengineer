/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP1;

/**
 *
 * @author Romell
 */
public class Televisor {

    protected InterfazComportamientoRecepcion comportamientoEmision;
    protected InterfazConportamientoSistema comportamientoSistema;
    protected int pixels;
    protected float pulgadas;

    public void Capatacion()
        {
            comportamientoEmision.CaptarSenal();
        }
    public void AdaptarMedio(){
        comportamientoSistema.TransformarSistema();
    }

}
