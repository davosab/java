/*
Sa se citeasca de la tastatura 2 numere. Daca ambele numere sunt pare sa se 
afiseze media artimetica. Daca ambele sunt impare sa se afiseze produsul 
lor. Daca unul este par si unul impar atunci sa se afiseze suma lor.
*/

import java.util.Scanner;

public class P3 {

  public static void main(String[] args) {
	
    Scanner myScanner = new Scanner(System.in);
    int nr1 = myScanner.nextInt();
    int nr2 = myScanner.nextInt();
    
    if (nr1 % 2 == 0 && nr2 % 2 == 0) {
      System.out.println((nr1 + nr2)/2);
      return;
    }
    if (nr1 % 2 != 0 && nr2 % 2 != 0) {
      System.out.println(nr1 * nr2);
      return;
    }
    System.out.println(nr1 + nr2);
  }

}
