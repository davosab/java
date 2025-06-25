package angajati;

public class AngajatCuOra extends Angajat {

  private int ore;

  public AngajatCuOra(String nume, double salar, int ore) {
    super(nume, salar * ore);
    this.ore = ore;
  }

  public void adaugaOre(int ore) {
    this.setOre(this.ore + ore);
  }

  public void schimbaSalarPeOra(double salar) {
    this.setSalar(salar);
  }

  public double calculSalar() {
    return this.getSalar();
  }

  public void setOre(int ore) {
    this.ore = ore;
  }

  
}
