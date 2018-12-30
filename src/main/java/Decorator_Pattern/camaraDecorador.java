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

public class camaraDecorador extends decoradorCelular{
    public camaraDecorador(Celular celularDecorado){
        super(celularDecorado);
        System.out.println("Función añadida: Cámara Digital");
    }
    /**Prueba todas la funcionalidades disponibles*/
    public void OpcionesDisponibles(){
        capturarFoto();
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
        return celularDecorado.verFunciones()+", Cámara digital";
    }
    /**Captura fotografías*/
    private void capturarFoto() {
        System.out.println("Foto capurada");
    }

}
