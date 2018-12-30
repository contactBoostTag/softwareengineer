/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package State_Pattern;

/**
 *
 * @author Romell
 */
class StateA implements State {
        public void writeName(StateContext stateContext, String name) {
                System.out.println(name.toLowerCase());
                stateContext.setState(new StateB());
        }
}