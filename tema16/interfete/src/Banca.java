import java.util.ArrayList;

public class Banca {
  
  private ArrayList<Client> clienti = new ArrayList<Client>();
  private String codBanca;

  public Banca(String codBanca) {
    this.codBanca = codBanca;
  }

  public String getCodBanca() {
    return codBanca;
  }

  public void add(Client c) {
    clienti.add(c);
  }

  public void afisareClient(String nume) {

    Client client = clienti.get(0);

    for (int i = 0; i < clienti.size(); i++) {
      if (clienti.get(i).getNume() == nume) {
        client = clienti.get(i);
        return;
      }
    }

    System.out.println(client.getNume() + " " + client.getAdresa());

    for (ContBancar c : client.getConturi()) {
      System.out.println(c.getSumaTotala());
    }
  }
}
