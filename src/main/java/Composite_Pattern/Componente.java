/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Composite_Pattern;

/**
 *
 * @author Romell
 */
public abstract class Componente
{
        protected String nombre;
        public Componente (String nombre)
        {
                this.nombre = nombre;
        }
        abstract public void Agregar(Componente c);
        abstract public void Eliminar(Componente c);
        abstract public void Mostrar(int profundidad);
}