package Mediador_Pattern;


public class Consumidor {
  private Mediator med;
  private int    id;
  private static int num = 6;
  public Consumidor( Mediator m ) {
    med = m;
    id = num; 
  }
  public void run() {
    while (true) {
      System.out.print("c" +" "+ "-" + med.retrieveMessage());
    }
  }
}
