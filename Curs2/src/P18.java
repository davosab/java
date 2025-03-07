/*
Sa se afiseze cifra minima a unui numar.
*/

import java.util.Scanner;

public class P18 {
  
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();
    int min = 9;

    while (n > 0) {
      if (n % 10 < min) min = n % 10;
      n /= 10;
    }
    System.out.println(min);
  }

}
