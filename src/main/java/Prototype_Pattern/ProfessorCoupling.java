/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

/**
 *
 * @author Eestudio
 */
public class ProfessorCoupling
{

 public static void sayIt( String words )
 {
  System.out.println( "" );
  System.out.println( words );
  System.out.println( "" );
 }

 public static void main( String[] args )
 {
 CloningMachine cMachine = new CloningMachine( );
  sayIt( "CREACION DE VACAS Y OVEJAS" );

  Oveja sheepTemplate = new Oveja( );
  Vaca cowTemplate = new Vaca(80,"Holstein");


  Oveja clonedSheep = (Oveja) sheepTemplate.clonar() ;
  sayIt( "\nprimera oveja clonada" );
  System.out.println( clonedSheep );

  Vaca clonedCow = (Vaca) cowTemplate.clonar() ;
  sayIt( "\nprimera vaca clonada" );
  System.out.println( clonedCow );

  sayIt( "Creando 10 vacas nuevas" );

  CloneableAnimal[] newCows = cMachine.createManyCopies( 3, cowTemplate );

  sayIt( "Creando 10 ovejas nuevas" );

  CloneableAnimal[] newSheeps = cMachine.createManyCopies( 3, sheepTemplate );

  sayIt( "Probando las vacas" );

  for( int i=0; i< newCows.length; i++ )
  {
   System.out.println( newCows[ i ] );
  }

  sayIt( "Probando las ovejas" );

  for( int i=0; i< newSheeps.length; i++ )
  {
   System.out.println( newSheeps[ i ] );
  } 

 }
}

