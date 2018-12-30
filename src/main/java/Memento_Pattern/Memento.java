/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento_Pattern;

/**
 *
 * @author Romell
 */
class Memento
{
    private String state;

    public Memento(String stateToSave)
    {
        state = stateToSave;
    }

    public String getSavedState()
    {
        return state;
    }
}



