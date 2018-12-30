/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor_Pattern;

/**
 *
 * @author Romell
 */
/*
 * Esta es la clase abstracta que define la interfaz de los visitantes
 * de la jerarquía Expresion -- en realidad, utilizamos una interfaz Java
 * dado que todos los métodos son abstractos.
 */
public interface VisitanteExpresion {
  public void visitarSuma(Suma s);
  public void visitarMult(Mult m);
  public void visitarVariable(Variable v);
  public void visitarConstante(Constante c);
}
