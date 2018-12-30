/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interpreter_Pattern;

import java.util.Stack;

/**
 *
 * @author Romell
 */
class TerminalExpression_Multiplication implements Expression{

   public void interpret(Stack<Integer> s)  { int tmp = s.pop(); s.push( s.pop() * tmp ); }

}
