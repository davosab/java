/*
Sa se citeasca de la tastatura 3 numere. Sa se afiseze valoarea minima.
*/

import java.util.Scanner;

public class P4 {

  public static void main(String[] args) {
	
	  Scanner myScanner = new Scanner(System.in);
	  int min = Integer.MAX_VALUE;
	
	  for (int i = 0; i < 3; i++) {
	    int userNr = myScanner.nextInt();
	    if (userNr < min) min = userNr;
	  }
	  System.out.println(min);
  }

}
