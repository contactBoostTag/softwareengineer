/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Adapter_Pattern;

/**
 *
 * @author Romell
 */
       /**
         * we Adapter/Wrapper AcousticGuitar into
         * ElectricAcousticGuitar to adapt into the GuitarModel
         */
        public class ElectricAcousticGuitar extends Guitar{
                AcousticGuitar acoustic = new AcousticGuitar();

                public void onGuitar() {
                        acoustic.play();
                }

                public void offGuitar() {
                        acoustic.leaveGuitar();
                }
        }