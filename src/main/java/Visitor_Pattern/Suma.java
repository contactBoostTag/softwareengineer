/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor_Pattern;

/**
 *
 * @author Romell
 */
public class Suma extends OpBinaria {
  public Suma(Expresion izq, Expresion der) { super(izq, der); }
  public void aceptar(VisitanteExpresion v) { v.visitarSuma(this); }
}