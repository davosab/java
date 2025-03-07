/*
Sa se afiseze separat cifrele unui numar.
*/

import java.util.Scanner;

public class P16 {

  static void printDigits(int nr) {
    if (nr == 0) return;

    printDigits(nr / 10);
    System.out.print(nr % 10 + " ");
  }

  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();

    printDigits(n);
  }
  
}
