/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory_Pattern;

/**
 *
 * @author Romell
 */
public class FabricaCinemaSamsung extends FabricaCinema{

    @Override
    protected TV metodoFabricaTV() {
        return new TV_LCD();
    }

    @Override
    protected HomeTeather metodoFabricaHomeTeather() {
        return new HomeTeather_HQ();
    }

    @Override
    protected void metodoInfo() {
        System.out.println("Fabricante Samsung");
    }
}
