/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_Pattern;

/**
 *
 * @author Romell
 */
public class IteradorVector {

    private int[] _vector;
    private int _posicion;

    public IteradorVector(Vector2 vector) {
        _vector = vector._datos;
        _posicion = 0;
    }

    public boolean hasNext() {
        if (_posicion < _vector.length) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        int valor = _vector[_posicion];
        _posicion++;
        return valor;
    }
}
