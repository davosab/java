public class Main {
  public static void main(String[] args) {
    Avion bo, con, mig, tom;

    bo = new Boeing("bo#1", 130, 400);
    con = new Concorde("con#2", 234, 50);
    mig = new Mig("mig#3", 353);
    tom = new TomCat("tom#4", 412);

    bo.takeOff();
    System.out.println(((Boeing)bo).getMaxPassengers());
    ((Concorde)con).goSuperSonic();
    ((Mig)mig).highSpeedGeometry();
    ((TomCat)tom).launchMissile();
    bo.land();
  }
}
