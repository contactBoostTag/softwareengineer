/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Command_Pattern;

/**
 *
 * @author Romell
 */
/*the Command for turning off the light - ConcreteCommand #2*/
public class FlipDownCommand implements Command {

   private Light theLight;

   public FlipDownCommand(Light light) {
      this.theLight = light;
   }

   public void execute() {
      theLight.turnOff();
   }

}