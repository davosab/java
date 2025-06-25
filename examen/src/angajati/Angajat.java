package angajati;

public abstract class Angajat {
  private String nume;
  private double salar;


  public Angajat(String nume, double salar) {
    this.nume = nume;
    this.salar = salar;
  }

  public double calculSalar() {
    return 0;
  }

  public double getSalar() {
    return salar;
  }

  public String getNume() {
    return nume;
  }

  public void setSalar(double salarNou) {
    this.salar = salarNou;
  }

  public boolean equals(Angajat a) {
    return this.nume == a.nume;
  }
}