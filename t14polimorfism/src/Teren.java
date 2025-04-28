public class Teren extends Proprietate {

  private int rang;
  
  public Teren(String tip, String strada, int nr, int suprafata, int rang) {
    super(strada, nr, suprafata);
    this.setTip(tip);
    this.setCost(350 * suprafata / rang);
  }

  public int getRang() {
    return rang;
  }
}
