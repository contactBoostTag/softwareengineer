/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_Pattern;

/**
 *
 * @author Romell
 */
public class Vector2 {

    public int[] _datos;

    public Vector2(int valores) {
        _datos = new int[valores];
        for (int i = 0; i < _datos.length; i++) {
            _datos[i] = 0;
        }
    }

    public int getValor(int pos) {
        return _datos[pos];
    }

    public void setValor(int pos, int valor) {
        _datos[pos] = valor;
    }

    public int dimension() {
        return _datos.length;
    }

    public IteradorVector iterador() {
        return new IteradorVector(this);
    }
}
