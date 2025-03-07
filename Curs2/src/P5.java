/*
Sa se determine suma primelor n numere pare – ‘n’ citit de la tastatura
*/

import java.util.Scanner;

public class P5 {

  public static void main(String[] args) {
	
	  Scanner myScanner = new Scanner(System.in);
	  int n = myScanner.nextInt();
	  int sum = 0;
	
	  for (int i = 0, j = 2; i < n; i++) {
	    sum += j;
	    j += 2;
	  }
	  System.out.println(sum);
  }

}
