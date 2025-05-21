public class Main {
  public static void main(String[] args) {
    Joc joc1 = new Joc("UEO", "OEU");
    Joc joc2 = new Joc("3McC", "3Flood");

    joc1.simuleaza();
    joc2.simuleaza();

    System.out.println(joc1);
    System.out.println(joc2);
  }
}
