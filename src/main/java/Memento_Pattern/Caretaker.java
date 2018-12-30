/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento_Pattern;

import java.util.ArrayList;

/**
 *
 * @author Romell
 */
class Caretaker {
   private ArrayList<Memento> savedStates = new ArrayList<Memento>();

   public void addMemento(Memento m) { savedStates.add(m); }
   public Memento getMemento(int index) { return savedStates.get(index); }
}   