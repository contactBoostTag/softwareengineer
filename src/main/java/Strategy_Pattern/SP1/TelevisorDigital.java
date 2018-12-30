/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP1;

/**
 *
 * @author Romell
 */
public class TelevisorDigital extends Televisor{

    public TelevisorDigital() {
        comportamientoEmision = new SenalDigital();
        comportamientoSistema = new SistemaNTSC();
    }


}
