package Mediador_Pattern;


public class MediatorDemos {
    public static void main( String[] args ) {
    Mediator mb = new Mediator();
    new Productor( mb ).start();
    
  }
}
