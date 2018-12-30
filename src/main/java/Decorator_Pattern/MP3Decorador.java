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

public class MP3Decorador extends decoradorCelular{

    public MP3Decorador(Celular celularDecorado){
        super(celularDecorado);
        System.out.println("Función añadida: Mp3 player");
    }
    /**Prueba todas la funcionalidades disponibles*/
    public void OpcionesDisponibles(){
        reproducirMP3();
        celularDecorado.OpcionesDisponibles();
    }
    /**Enviar mensaje de texto*/
    public void MandarSMS(String numero) {
        celularDecorado.MandarSMS(numero);
    }
    /**Llamar*/
    public void llamar(String numero) {
        celularDecorado.llamar(numero);
    }
     /**Recargar saldo*/
    public void recargar(int monto) {
        celularDecorado.recargar(monto);
    }
    /**Muestra las funcionalidades del celular*/
    public String verFunciones() {
        return celularDecorado.verFunciones()+", Reproductor MP3";
    }

    private void reproducirMP3() {
        System.out.println("Reproduciendo: Boys don't cry - The Cure");
    }

}
