/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfResponsibility_Pattern;

/**
 *
 * @author Romell
 */
class ChainOfResponsibilityExample{
   public static void main(String[] args) {
       // Construimos la cadena
       // DebugLogger(DEBUG = 7) => EMailLogger(Error = 3) => StderrLogger(Notice = 5)
       Logger l = new DebugLogger(Logger.DEBUG).setNext(
                   new EMailLogger(Logger.ERR).setNext(
                    new StderrLogger(Logger.NOTICE) ) );

       // Ejecutamos
       l.message("Entrando en function y.", Logger.DEBUG); // manejado por DebugLogger
       l.message("paso 1 completado.", Logger.NOTICE);     // manejado por DebugLogger y StderrLogger
       l.message("Ha ocurrido un error.", Logger.ERR);     // menejado por los tres Logger
   }
}
