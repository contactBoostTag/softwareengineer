/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Flyweight_Pattern;

/**
 *
 * @author Romell
 */
public class CoffeeOrderContext {
   private int tableNumber;

   public CoffeeOrderContext(int tableNumber) {
       this.tableNumber = tableNumber;
   }

   public int getTable() {
       return this.tableNumber;
   }
}