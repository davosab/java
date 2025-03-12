public class Birou {

  private int lat;
  private int lun;
  private int ina;
  private Sertar s1;
  private Sertar s2;
  private String comp;

  public Birou(Sertar s1, Sertar s2, int lat, int lun, int ina) {
    this.s1 = s1;
    this.s2 = s2;
    this.lat = lat;
    this.lun = lun;
    this.ina = ina;
    this.comp = 
      "Birou " + this.lat + " " + this.lun + " " + this.ina + "\n" + 
      this.s1 + "\n" + this.s2;

  }

  // Tipareste
  public String toString() {
    return comp;
  }

  public static void main(String[] args) {

    Sertar s1 = new Sertar(20, 30, 10);
    Sertar s2 = new Sertar(25, 35, 15);
    Birou b1 = new Birou(s1, s2, 150, 50, 75);
    System.out.println(b1);

  }
}
