/*
Sa se afiseze cifra maxima a unui numar.
*/

import java.util.Scanner;

public class P17 {
  
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();
    int max = 0;

    while (n > 0) {
      if (n % 10 > max) max = n % 10;
      n /= 10;
    }
    System.out.println(max);
  }

}
