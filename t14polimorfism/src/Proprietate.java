public abstract class Proprietate {
  private String tip;
  private String strada;
  private int nr;
  private String adresa;
  private int suprafata;
  private int cost;

  public Proprietate(String strada, int nr, int suprafata) {
    this.strada = strada;
    this.nr = nr;
    this.adresa = "Strada " + strada + " Nr. " + nr;

    this.suprafata = suprafata;
  }

  public String getTip() {
    return tip;
  }
  
  public String getStrada() {
    return strada;
  }
  
  public int getNr() {
    return nr;
  }

  public String getAdresa() {
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
