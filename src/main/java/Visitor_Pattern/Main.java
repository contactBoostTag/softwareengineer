/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor_Pattern;

/**
 *
 * @author Romell
 */
class Main {

    static public void main(String argv[]) {
        // Construcción de una expresión (a+5)*(b+1)
        Expresion expresion = new Suma(new Mult(new Suma(new Variable("a"),
                new Constante(5)),
                new Suma(new Variable("b"),
                new Constante(1))),
                new Variable("z"));

        // Pretty-printing...
        PrettyPrinterExpresion pretty = new PrettyPrinterExpresion();
        expresion.aceptar(pretty);

        // Visualizacion de resultados
        System.out.println("Resultado: " + pretty.obtenerResultado());
    }
}
