/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Adapter_Pattern;

/**
 *
 * @author Romell
 */
public class AdapterWrapperPattern {

        public static void main(String args[]){
                Guitar eGuitar = new ElectricGuitar();
                eGuitar.onGuitar();
                eGuitar.offGuitar();
                Guitar eAGuitar = new ElectricAcousticGuitar();
                eAGuitar.onGuitar();
                eAGuitar.offGuitar();
        }



}