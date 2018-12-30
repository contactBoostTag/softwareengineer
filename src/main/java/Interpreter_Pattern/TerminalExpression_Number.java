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
class TerminalExpression_Number implements Expression {
   private int number;
   public TerminalExpression_Number(int number)       { this.number = number; }
   public void interpret(Stack<Integer> s)  { s.push(number); }
}