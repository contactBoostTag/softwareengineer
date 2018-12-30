package Mediador_Pattern;


public class Mediator {
  private boolean aviso = false;
  private int nro;

  public synchronized void storeMessage( int num ) {    //mensajeDeLaTienda
    while (aviso == true) {
      try {
        wait();
      }
      catch (InterruptedException e ) { }
    }
    aviso = true;
    nro = num;
    notifyAll();
  }

  public synchronized int retrieveMessage() {   //RecuperarMensajes

    while (aviso == false)
      try {
        wait();
      }
      catch (InterruptedException e ) { }
    aviso = false;
    notifyAll();
    return nro;
  }
}
