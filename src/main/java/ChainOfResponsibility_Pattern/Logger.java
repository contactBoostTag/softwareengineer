/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfResponsibility_Pattern;

/**
 *
 * @author Romell
 */
import java.util.*;

abstract class Logger {
   public static int ERR = 3;
   public static int NOTICE = 5;
   public static int DEBUG = 7;
   protected int mask;

   protected Logger next; // el siguiente elemento en la cadena
   public Logger setNext(Logger l) { next = l; return this; }

   abstract public void message(String msg, int priority);
}