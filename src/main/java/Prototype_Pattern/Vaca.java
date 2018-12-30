/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

/**
 *
 * @author Eestudio
 */
public class Vaca implements CloneableAnimal
{
    private String nombre;
    private double peso;
    private String raza;
   
 public Vaca(double p,String raza )
 {
     this.peso = p;
     this.raza = raza;
     System.out.println( "Creada la plantilla de la vaca" );
 }

 public CloneableAnimal clonar( )
 {
    System.out.println( "creando una nueva instancia de Vaca" );
    Vaca returnValue = null;

    try
    {
        returnValue = ( Vaca ) super.clone( );
    }
    catch( Exception e )
    {
        System.out.println( "error cloning Vaca" );
    }
    return returnValue;
 }

    @Override
 public String toString( )
 {
  return "Muuuu, soy un clon de vaca\n" + "Peso : "+peso + "Raza: "+raza;
 }

}

