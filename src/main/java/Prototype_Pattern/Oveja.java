/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

/**
 *
 * @author Eestudio
 */
public class Oveja implements CloneableAnimal
{
 public Oveja( )
 {
  System.out.println( "Creada la plantilla de la oveja" );
 }

 public CloneableAnimal clonar( )
 {
  System.out.println( "La oveja se va a clonar a sí misma" );
  Oveja returnValue = null;

  try
  {
   returnValue = ( Oveja ) super.clone( );
  }
  catch( Exception e )
  {
   System.out.println( "error cloning Sheep" );
  }

  return returnValue;
 }

 public String toString( )
 {
  return "Soy una oveja clonada, beeeeee";
 }
}

