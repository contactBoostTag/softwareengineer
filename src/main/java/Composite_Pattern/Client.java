/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Composite_Pattern;

/**
 *
 * @author Romell
 */
public class Client
{
        public static void main(String[] args)
        {
                Compuesto raiz = new Compuesto("root");
                raiz.Agregar(new Hoja("hoja A"));
                raiz.Agregar(new Hoja("hoja B"));
                Compuesto comp = new Compuesto("compuesto X");
                comp.Agregar(new Hoja("hoja XA"));
                comp.Agregar(new Hoja("hoja XB"));
                raiz.Agregar(comp);
                raiz.Agregar(new Hoja("hoja C"));
                Hoja l = new Hoja("hoja D");
                raiz.Agregar(l);
                raiz.Eliminar(l);
                raiz.Mostrar(1);
        }
}