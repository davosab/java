public class Main {
  public static void main(String[] args) {
    
    Contribuabil c1 = new Contribuabil("Ion Popescu");
    c1.addProprietate(new Cladire("Cladire", "V Parvan", 2, 20));
    c1.addProprietate(new Teren("Teren", "V. Parvan", 2, 10, 1));
    c1.addProprietate(new Cladire("Cladire", "Lugoj", 4, 25));
    c1.scrieFluturas();
  }
}
