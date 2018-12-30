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

public class radioDecorador extends decoradorCelular {

    public radioDecorador(Celular celularDecorado) {
        super(celularDecorado);
        System.out.println("Función añadida: Radio FM");
    }
    /**Prueba todas la funcionalidades disponibles*/
    public void OpcionesDisponibles() {
        oirRadio();
        celularDecorado.OpcionesDisponibles();
    }
    /**Sintonice radio*/
    public void oirRadio() {
        System.out.println("Sintonizando: 107.7 fm");
    }
    /**Enviar mensaje de texto*/
    public void MandarSMS(String numero) {
        celularDecorado.MandarSMS(numero);
    }
    /**Llamar*/
    public void llamar(String numero) {
        celularDecorado.llamar(numero);
    }
    /**Muestra las funcionalidades del celular*/
    public String verFunciones() {
        return celularDecorado.verFunciones() + ", Radio";
    }
     /**Recargar saldo*/
    public void recargar(int monto) {
        celularDecorado.recargar(monto);
    }
}
