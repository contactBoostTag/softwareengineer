/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory_Pattern;

/**
 *
 * @author Romell
 */
public class Factory_main {

    public static void main(String[] args) {
        // TODO code application logic here
        FabricaCinema CreadorCinema;
        CreadorCinema = new FabricaCinemaLG();
        Cinema cinema = new Cinema(CreadorCinema);
        cinema.usar();
    }
}
