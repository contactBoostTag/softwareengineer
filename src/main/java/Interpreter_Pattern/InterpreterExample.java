/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interpreter_Pattern;

/**
 *
 * @author Romell
 */

class InterpreterExample {
   public static void main(String[] args) {
       System.out.println("'42 2 3 5 * - +' equals " + new Parser("42 2 3 5 * - +").evaluate());
   }
}