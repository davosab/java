import angajati.AngajatCuOra;
import angajati.AngajatCuSalarFix;
import firme.Firma;

public class Client {
  public static void main(String[] args) {
    
    AngajatCuOra a1 = new AngajatCuOra("David", 20.50, 30);
    AngajatCuSalarFix a2 = new AngajatCuSalarFix("Marius", 2000);

    Firma f = new Firma();

    f.angajeaza(a1);
    f.angajeaza(a2);

    System.out.println(f.salariuMediu());

    AngajatCuOra a3 = new AngajatCuOra("David", 30.00, 200);
    f.angajeaza(a3);

    System.out.println(f.salariuMediu());

    a2.schimbaSalarFix(2500);
    System.out.println(f.salariuMediu());

  }
}
