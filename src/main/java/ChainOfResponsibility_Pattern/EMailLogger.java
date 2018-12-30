/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfResponsibility_Pattern;

/**
 *
 * @author Romell
 */
class EMailLogger extends Logger{
   public EMailLogger(int mask) { this.mask = mask; }

   public void message(String msg, int priority) {
       if (priority <= mask) System.out.println("Enviando un  e-mail: " + msg);
       if (next != null) next.message(msg, priority);
   }
}