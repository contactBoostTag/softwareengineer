/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP1;

/**
 *
 * @author Romell
 */
public class TelevisorAnalogico extends Televisor{

    public TelevisorAnalogico() {
        comportamientoEmision = new SenalAnalogica();
        comportamientoSistema = new SistemaPAL();
    }



}
