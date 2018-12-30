/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Module_Pattern;

import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author Romell
 */
public final class mainmodule {

  private static  mainmodule Singleton  = null;

  public InputStreamReader input  = null;
  public PrintStream output = null;
  public PrintStream error  = null;

  public mainmodule() {
    // does nothing on purpose !!!
  }

  // ...

  public static mainmodule getSingleton() {
    if (mainmodule.Singleton == null) {
       mainmodule.Singleton = new mainmodule();
    }

    return mainmodule.Singleton;
  }

  // ...

  public void prepare() {
    //System.out.println("console::prepare();");

    this.input = new InputStreamReader(System.in);
    this.output= new PrintStream(System.out);
    this.error = new PrintStream(System.out);
  }

  public void unprepare() {
    this.output = null;
    this.input  = null;
    this.error  = null;

    //System.out.println("console::unprepare();");
  }

  // ...

  public void printNewLine() {
    System.out.println("");
  }

  public void printString(String Value) {
    System.out.print(Value);
  }

  public void printInteger(Integer Value) {
    System.out.print(Value);
  }

  public void printBoolean(Boolean Value) {
    System.out.print(Value);
  }

  public void ScanNewLine() {
    // to-do: ...
  }

  public void ScanString(String Value) {
    // to-do: ...
  }

  public void ScanInteger(Integer Value) {
    // to-do: ...
  }

  public void ScanBoolean(Boolean Value) {
    // to-do: ...
  }

  // ...

}