/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor_Pattern;

/**
 *
 * @author Romell
 */
public class Variable extends Expresion {
  public Variable(String variable) { _variable = variable; }
  public void aceptar(VisitanteExpresion v) { v.visitarVariable(this); }
  String _variable;
}