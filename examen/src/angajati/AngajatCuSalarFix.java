package angajati;

public class AngajatCuSalarFix extends Angajat {
  
  public AngajatCuSalarFix(String nume, double salarFix) {
    super(nume, salarFix);
  }

  public double calculSalar() {
    return this.getSalar();
  }

  public void schimbaSalarFix(double salarNou) {
    this.setSalar(salarNou);
  }
}
