/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfResponsibility_Pattern;

/**
 *
 * @author Romell
 */
class StderrLogger extends Logger{
   public StderrLogger(int mask) { this.mask = mask; }

   public void message(String msg, int priority) {
       if (priority <= mask) System.out.println("Escribiendo en STDERR: " + msg);
       if (next != null) next.message(msg, priority);
   }
}
