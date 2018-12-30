/*
 * Design Pattern: DECORATOR
 * 
 */

package Decorator_Pattern;

/**
 * @authores Abad Carmona, Pablo
 *           Chávez Malpartida, Frank
 *           Manrique Salazar, Williams
 */
abstract class decoradorCelular extends Celular {

    protected Celular celularDecorado;

    public decoradorCelular(Celular cel) {
        this.celularDecorado = cel;
    }

    /**Prueba todas la funcionalidades disponibles*/
    public abstract void OpcionesDisponibles();

    /**Muestra las funcionalidades del celular*/
    public abstract String verFunciones();
}





