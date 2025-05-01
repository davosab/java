public class ContLei extends ContBancar {
  
  public ContLei(String numarCont, float suma) {
    super(numarCont, suma);
  }

  public void transfer(ContBancar contDestinatie, float suma) {
    this.setSuma(this.getSuma() - suma);
    contDestinatie.setSuma(contDestinatie.getSuma() + suma);
    System.out.println("Se transfera " + suma + " catre " + contDestinatie.getNumarCont());
  }

  @Override
  public float getSumaTotala() {
    return getSuma();
  }
}
