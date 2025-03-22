public class Carte {

  private int nrPagini;

  public Carte(int nrPagini)  {
    this.nrPagini = nrPagini;
  }

  public boolean potrivita(Carte carte) {
    return this.nrPagini == carte.nrPagini;
  }

  public static void main(String[] args) {
    
    Carte carte1 = new Carte(260);
    Carte carte2 = new Carte(260);

    System.out.println(carte1.potrivita(carte2));

  }
}
