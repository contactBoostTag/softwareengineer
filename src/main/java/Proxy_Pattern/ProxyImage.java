/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Proxy_Pattern;

/**
 *
 * @author Romell
 */
//on System B
class ProxyImage implements Image {
    private String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }
}