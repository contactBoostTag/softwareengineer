/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP2;

/**
 *
 * @author Romell
 */
// The classes that implement a concrete strategy should implement this.
// The context class uses this to call the concrete strategy.
interface Strategy {
    int execute(int a, int b);
}









