/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Adapter_Pattern;

/**
 *
 * @author Romell
 */
public class ElectricGuitar extends Guitar{

                public void onGuitar() {
                        System.out.println("Playing Guitar");
                }

                public void offGuitar() {
                        System.out.println("I'm tired to play the guitar");
                }
        }
