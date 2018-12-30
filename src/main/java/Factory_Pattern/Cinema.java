/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory_Pattern;

/**
 *
 * @author Romell
 */
public class Cinema {

    private TV tv;
    private HomeTeather ht;

    public Cinema(FabricaCinema FC) {
        FC.metodoInfo();
        this.tv = FC.fabricarTV();
        this.ht = FC.fabricarHomeTeather();
    }

    public void usar(){
        this.encender();
        this.subirVolumen();
    }

    private void encender(){
        this.tv.encender();
    }

    private void subirVolumen(){
        this.ht.subirVolumen();
    }
}
