/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

/**
 *
 * @author Eestudio
 */
public class CloningMachine
{
public CloningMachine( ){}

    public CloneableAnimal createCopy( CloneableAnimal a )
    {
        return a.clonar();
    }

    public CloneableAnimal[] createManyCopies( int numCopies, CloneableAnimal Animal )
    {
        CloneableAnimal[] returnArray = new CloneableAnimal[ numCopies ];
        for( int i=0; i< numCopies; i++ )
        {
            returnArray[ i ] = Animal.clonar();
        }
        return returnArray;
    }
}


