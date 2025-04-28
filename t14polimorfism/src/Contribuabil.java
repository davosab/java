import java.util.ArrayList;

public class Contribuabil {
    
    private String nume;
    private ArrayList<Proprietate> proprietati = new ArrayList<Proprietate>();
    private String fluturas = "";
    private int sumaTotala;

    public Contribuabil(String nume) {
      this.nume = nume;
    }

    public void addProprietate(Proprietate p) {
      proprietati.add(p);
      sumaTotala += p.getCost();
    }

    public void scrieFluturas() {
      fluturas = 
        "Contribuabil: " + nume + "\n\n" + 
        "Proprietati \n";

      for (Proprietate p: proprietati) {
        fluturas += 
          "    " + (p.getTip() == "Cladire" ? "Cladire: " : "Teren:   ") + p.getAdresa() + "\n" + 
          "             " + "Suprafata: " + p.getSuprafata() + (p.getTip() == "Teren" ? ", Rand: " + ((Teren) p).getRang() : "") + "\n" + 
          "             " + "Cost: " + p.getCost() + "\n\n";
      }

      fluturas += 
        "Suma totala: " + sumaTotala;

      System.out.println(fluturas);
    }

    
}
