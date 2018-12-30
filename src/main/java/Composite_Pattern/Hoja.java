/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Composite_Pattern;

/**
 *
 * @author Romell
 */
class Hoja extends Componente
{
        public Hoja (String nombre)
        {
                super(nombre);
        }
        public void Agregar(Componente c)
        {
                System.out.println("no se puede agregar la hoja");
        }
        public void Eliminar(Componente c)
        {
                System.out.println("no se puede quitar la hoja");
        }
        public void Mostrar(int depth)
        {
                System.out.println('-' + "" + nombre);
        }
}