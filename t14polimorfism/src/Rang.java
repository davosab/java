public enum Rang {
  
  I(1), II(2), III(3), IV(4);

  private int cod;

  private Rang(int cod) {
    this.cod = cod;
  }

  public static Rang fromCod(int cod) {
    for (Rang r : Rang.values()) {
      if (r.cod == cod) return r;
    }
    throw new IllegalArgumentException("Invalid Rang code: " + cod);
  }

  public int getCod() {
    return cod;
  }
}
