public class ContEuro extends ContBancar {

  private float dobanda = (getSuma() > 500) ? 0.3f : 0;

  public ContEuro(String numarCont, float suma) {
    super(numarCont, suma);
  }

  public float getDobanda() {
    return dobanda;
  }

  @Override
  public float getSumaTotala() {
    return getSuma() * 36;
  }

}
