/*
 * Ejemplo de aplicación del patrón de diseño: DECORATOR
 * El patrón Decorator permite añadir funcionalidades en tiempo de ejecución
 */

package Decorator_Pattern;

/**
 * @authores Abad Carmona, Pablo
 *           Chávez Malpartida, Frank
 *           Manrique Salazar, Williams
 */
public class Main {

    public static void main(String[] args) {

        Celular cel = new CelularBasico();
        System.out.println("CELULAR 1");
        //Mostrar las características del celular: Básico
        System.out.println("Funciones: "+cel.verFunciones());
        
        cel = new camaraDecorador(cel);
        //Mostrar las características del celular: Celular con cámara
        System.out.println("Funciones: "+cel.verFunciones());

        cel = new radioDecorador(cel);
        //Mostrar las características del celular: Celular con cámara y radio
        System.out.println("Funciones: "+cel.verFunciones());
        
        cel = new MP3Decorador(cel);
        //Mostrar las características del celular: Celular con cámara, mp3 y radio
        System.out.println("Funciones: "+cel.verFunciones());

        //otra manera de declarar
        System.out.println("\nCELULAR 2");
        Celular cel2 = new radioDecorador(new camaraDecorador(new MP3Decorador(new CelularBasico())));
        //Mostrar las características del celular cel2: Celular con cámara, mp3 y radio
        System.out.println("Funciones: "+cel2.verFunciones());
    }

}
