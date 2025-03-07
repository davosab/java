/*
Sa se determine daca un numar este palindrom sau nu (palindrom = care citit de 
la stânga la dreapta sau de la dreapta la stânga rămâne neschimbat ex 4334).
*/

import java.util.Scanner;

public class P20 {
  
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

    System.out.println(n == ogl(n));
  }
  
}
