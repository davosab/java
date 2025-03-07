/*
Sa se afiseze inversul unui numar dat (124 -> 421).
*/

import java.util.Scanner;

public class P19 {

  static int ogl(int n) {
    int nrOgl = 0;
    while (n > 0) {
      nrOgl *= 10;
      nrOgl += n % 10;
      n /= 10;
    }
    return nrOgl;
  }
  public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();

    System.out.println(ogl(n));
  }
  
}
