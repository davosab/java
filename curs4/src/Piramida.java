public class Piramida {
  private int n;

  public Piramida(int n) {
    this.n = n;
  }

  public String toString() {
    int nrOfNs = this.n;
    String pir = "";

    for (int i = 1; i <= this.n; i++) {
      for (int j = nrOfNs; j >= 1; j--) {
        pir += i;
      }
      nrOfNs--;
      pir += "\n";
    }
    return pir;
  }

  public static void main(String[] args) {

    Piramida p = new Piramida(4);
    System.out.println(p);;

  }
}
