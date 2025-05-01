public class Main {
  public static void main(String[] args) {

    Banca banca = new Banca("c0dB4nc4");

    Client client1 = new Client("David", "Oradea", new ContEuro("nrContEuro1", 600.00f));
    Client client2 = new Client("Yoncsi", "Tinca", new ContLei("nrContLei1", 1000.00f));

    System.out.println("Lucram la banca " + banca.getCodBanca());

    System.out.println("Contul lui " + client1.getNume() + " are dobanda "  + 
      ((ContEuro) client1.getContulNr("nrContEuro1")).getDobanda()
    );

    client1.addCont(new ContLei("nrContLei2", 2000.00f));

    client1.getContulNr("nrContLei2");

    transferDeLaXLaYSuma(
      (ContLei) client1.getContulNr("nrContLei2"), 
      (ContLei) client2.getContulNr("nrContLei1"), 
      100.00f
    );
    
  }

  public static void transferDeLaXLaYSuma(ContLei cont1, ContLei cont2, float suma) {
    System.out.println("Suma " + cont1.getNumarCont() + " = " + cont1.getSumaTotala());
    System.out.println("Suma " + cont2.getNumarCont() + " = " + cont2.getSumaTotala());
    cont1.transfer(cont2, suma);
    System.out.println("Suma noua " + cont1.getNumarCont() + " = " + cont1.getSumaTotala());
    System.out.println("Suma noua " + cont2.getNumarCont() + " = " + cont2.getSumaTotala());
    System.out.println("Transferul sa realizat cu succes!");
  }
}
