public class Adresa {

  private String strada;
  private int nr;

  public Adresa(String strada, int nr) {
    this.strada = strada;
    this.nr = nr;
  }

  public String toString() {
    return "Strada " + strada + " Nr. " + nr;
  }
}
