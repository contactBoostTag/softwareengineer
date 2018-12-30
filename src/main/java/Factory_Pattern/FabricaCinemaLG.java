/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory_Pattern;


/**
 *
 * @author Romell
 */
public class FabricaCinemaLG extends FabricaCinema{

    @Override
    protected TV metodoFabricaTV() {
        return new TV_LED();
    }

    @Override
    protected HomeTeather metodoFabricaHomeTeather() {
        return new HomeTeather_WOW();
    }

    @Override
    protected void metodoInfo() {
        System.out.println("Fabricante LG");
    }

}
