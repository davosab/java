public class Patrat {
  private int l;
  private int a;

  public Patrat() {
    this.l = 10;
    this.a = this.l * this.l;
  }

  public Patrat(int l) {
    this.l = l;
    this.a = this.l * this.l;
  }

  public String toString() {
    return "Patrat " + this.l + " Aria " + this.a;
  }

  public static void main(String[] args) {
    Patrat p1 = new Patrat();
    Patrat p2 = new Patrat(9);

    System.out.println(p1);
    System.out.println(p2);
  }
}
