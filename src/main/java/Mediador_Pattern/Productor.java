package Mediador_Pattern;


public class Productor extends Thread{

  private Mediator med;
  private int    id;
  private static int num = 1;
  public Productor( Mediator m ) {
    med = m;
    id = num+100;
  }

  public void run() {
    int num;
    while (true) {
      med.storeMessage(num=10);
      System.out.print( "productor " + " "+ id + "-" + num + "  " );
    }
  }
}
