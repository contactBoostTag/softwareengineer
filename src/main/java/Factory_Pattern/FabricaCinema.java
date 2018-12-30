/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory_Pattern;


/**
 *
 * @author Romell
 */
public abstract class FabricaCinema {

    public TV fabricarTV(){
        return metodoFabricaTV();
    }

    protected abstract TV metodoFabricaTV();

    public HomeTeather fabricarHomeTeather(){
        return metodoFabricaHomeTeather();
    }

    protected abstract HomeTeather metodoFabricaHomeTeather();

    protected  abstract void metodoInfo();

}
