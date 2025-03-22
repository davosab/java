public class Suma {

  public static int suma(int a, int b) {
    return a + b;
  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }

  public static int suma(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public static void main(String[] args) {
    Suma.suma(1, 2);
    Suma.suma(1, 2, 3);
    Suma.suma(1, 2, 3, 4);
  }
}
