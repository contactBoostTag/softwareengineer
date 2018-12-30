/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Command_Pattern;

/**
 *
 * @author Romell
 */
/*the Receiver class*/
public class Light {

   public Light() {
   }

   public void turnOn() {
      System.out.println("The light is on");
   }

   public void turnOff() {
      System.out.println("The light is off");
   }

}