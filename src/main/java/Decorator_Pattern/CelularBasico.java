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

public class CelularBasico extends Celular {

    private int saldo;
    /**Prueba todas la funcionalidades disponibles*/
    public void OpcionesDisponibles(){
        MandarSMS("666");
        llamar("666");
        recargar(20);
    }
    /**Enviar mensaje de texto*/
    public void MandarSMS(String numero) {
        System.out.println("Mensaje enviado al "+numero);
    }
    /**Llamar*/
    public void llamar(String numero) {
        System.out.println("Llamando al "+numero+"...");
        for (int i = 0; i < 1000000000; i++);
        System.out.println("Llamada finalizada");
    }
     /**Recargar saldo*/
    public void recargar(int monto) {
        saldo+=monto;
        System.out.println("Monto recargado "+monto);
    }
    /**Muestra las funcionalidades del celular*/
    public String verFunciones(){
        return "Llamadas y envío de mensajes de texto";
    }

}
