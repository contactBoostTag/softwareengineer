/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor_Pattern;

/**
 *
 * @author Romell
 */
public class Constante extends Expresion {
  public Constante(int valor) { _valor = valor; }
  public void aceptar(VisitanteExpresion v) { v.visitarConstante(this); }
  int _valor;
}
