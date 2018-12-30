/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Strategy_Pattern.SP2;

/**
 *
 * @author Romell
 */
class ConcreteStrategySubtract implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }
}