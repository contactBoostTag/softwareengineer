/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP2;

/**
 *
 * @author Romell
 */
// Implements the algorithm using the strategy interface
class ConcreteStrategyAdd implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd's execute()");
        return a + b;  // Do an addition with a and b
    }
}