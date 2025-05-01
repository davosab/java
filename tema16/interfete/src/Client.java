import java.util.ArrayList;

public class Client {
  private String nume;
  private String adresa;
  private ArrayList<ContBancar> conturi = new ArrayList<ContBancar>();
  
  public Client(String nume, String adresa, ContBancar contDeDeschidere) {
    this.nume = nume;
    this.adresa = adresa;
    this.addCont(contDeDeschidere);
  }

  public String getNume() {
    return nume;
  }
  public void setNume(String nume) {
    this.nume = nume;
  }
  public String getAdresa() {
    return adresa;
  }
  public void setAdresa(String adresa) {
    this.adresa = adresa;
  }

  public ArrayList<ContBancar> getConturi() {
    return conturi;
  }

  public ContBancar getContulNr(String numarCont) {
    for (ContBancar c : conturi) {
      if (c.getNumarCont() == numarCont) {
        return c;
      }
    }
    throw new IllegalArgumentException("Contul cu numarul " + numarCont + " nu a fost gasit.");
  }

  public void addCont(ContBancar c) {
    if (conturi.size() <= 5) {
      conturi.add(c);
    } else {
      System.out.println("Clientul are deja maximul de 5 conturi!");
    }
  }

  public String toString() {

    if (conturi.size() == 0) {
      return "Clientul nu are niciun cont!";
    }

    String info = nume + " " + adresa + "\n\n";
    
    for (ContBancar c : conturi)
      info += c + "\n";

    return info;
  }

}
