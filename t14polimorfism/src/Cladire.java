public class Cladire extends Proprietate {

  public Cladire(String tip, String strada, int nr, int suprafata) {
    super(strada, nr, suprafata);
    this.setTip(tip);
    this.setCost(500 * suprafata);
  }
  
}
