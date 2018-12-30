/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer_Pattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Romell
 */
public class ResponseHandler implements Observer {
    private String resp;
    public void update (Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: "+ resp );
        }
    }
}