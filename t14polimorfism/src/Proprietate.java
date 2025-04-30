public abstract class Proprietate {
  private String tip;
  private Adresa adresa;
  private int suprafata;
  private int cost;

  public Proprietate(String strada, int nr, int suprafata) {
    this.adresa = new Adresa(strada, nr);

    this.suprafata = suprafata;
  }

  public String getTip() {
    return tip;
  }

  public Adresa getAdresa() {
    return adresa;
  }

  public int getSuprafata() {
    return suprafata;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }
  
  public void setTip(String tip) {
    this.tip = tip;
  }
  
}
