/*
 * Design Pattern: DECORATOR
 * 
 */

package Decorator_Pattern;

/**
 * @authores Abad Carmona, Pablo
 *           Ch??vez Malpartida, Frank
 *           Manrique Salazar, Williams
 */

public abstract class Celular {
    /**Prueba todas la funcionalidades disponibles*/
    public abstract void OpcionesDisponibles();
    /**Enviar mensaje de texto*/
    public abstract void MandarSMS(String numero);
    /**Llamar*/
    public abstract void llamar(String numero);
    /**Recargar saldo*/
    public abstract void recargar(int monto);
    /**Muestra las funcionalidades del celular*/
    public abstract String verFunciones();
}

