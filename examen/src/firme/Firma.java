package firme;

import java.util.*;
import angajati.Angajat;

public class Firma {

  public boolean angajatExista = false;
  private int nrAngajati = 0;
  private Map<Integer, Angajat> angajati = new HashMap<Integer, Angajat>();

  public void angajeaza(Angajat a) {
    angajatExista = false;

    for (Angajat ang : angajati.values()) {
      if (a.equals(ang)) {
        angajatExista = true;
        System.out.println("FALSE - angajatul cu numele " + ang.getNume() + " exista!");
        return;
      }
    }

    if (!angajatExista) {
      nrAngajati++;
      angajati.put(nrAngajati, a);
      System.out.println("TRUE");
    }
  }

  public double salariuMediu() {
    if (nrAngajati == 0)
      return 0;

    int salarMediu = 0;

    for (Angajat ang : angajati.values()) {
      salarMediu += ang.getSalar();
    }

    return salarMediu /= nrAngajati;
  }
}
