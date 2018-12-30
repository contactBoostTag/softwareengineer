/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor_Pattern;

/**
 *
 * @author Romell
 */
public abstract class OpBinaria extends Expresion {
  public OpBinaria(Expresion izq, Expresion der) { _izq = izq; _der = der; }
  Expresion _izq, _der;
}
