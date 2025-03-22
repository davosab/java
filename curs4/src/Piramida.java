public class Piramida {
  private int n;

  public Piramida(int n) {
    this.n = n;
  }

  public void potrivita() {
    int nrOfNs = this.n;

    for (int i = 1; i <= this.n; i++) {
      for (int j = nrOfNs; j >= 1; j--) {
        System.out.print(i);
      }
      nrOfNs--;
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Piramida p = new Piramida(4);
    p.potrivita();

  }
}
