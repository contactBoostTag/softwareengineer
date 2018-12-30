/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor_Pattern;

/**
 *
 * @author Romell
 */
public class Mult extends OpBinaria {
  public Mult(Expresion izq, Expresion der) { super(izq, der); }
  public void aceptar(VisitanteExpresion v) { v.visitarMult(this); }
}
