/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_Pattern;

/**
 *
 * @author Romell
 */
public class Iterator_Demo {

    public static void main(String argv[]) {
        Vector2 vector = new Vector2(5);

        // Creacion del iterador
        IteradorVector iterador = vector.iterador();

        // Recorrido con el iterador
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
