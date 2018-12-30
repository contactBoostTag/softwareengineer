/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Module_Pattern;

/**
 *
 * @author Romell
 */
class ConsoleDemo {
  public static mainmodule Console = null;

  public static void prepare()
  {
    Console = mainmodule.getSingleton();

    Console.prepare();
  }

  public static void unprepare()
  {
    Console.unprepare();
  }

  public static void execute(String args[])
  {
    Console.printString("Hello World");
    Console.printNewLine();
      Console.ScanNewLine();
  }

  public static void main(String args[])
  {
    prepare();
    execute(args);
    unprepare();
  }
}