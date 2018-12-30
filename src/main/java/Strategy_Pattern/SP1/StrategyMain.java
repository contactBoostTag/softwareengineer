/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP1;

/**
 *
 * @author Romell
 */
public class StrategyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelevisorAnalogico televisor1 = new TelevisorAnalogico();
        TelevisorDigital televisor2 = new TelevisorDigital();
        televisor1.Capatacion();
        televisor1.AdaptarMedio();
        televisor2.Capatacion();
        televisor2.AdaptarMedio();
    }

}
