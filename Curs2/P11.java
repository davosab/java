/*
Sa se afiseze toti divizorii numarului ‘n’ dat.
*/

import java.util.Scanner;

public class P11 {

  public static void main(String[] args) {
	
	  Scanner myScanner = new Scanner(System.in);
	  int n = myScanner.nextInt();
	
	  for (int i = 1; i * i <= n; i++) {
	    if (n % i == 0) {
		    if (n / i == i) {
		      System.out.println(i);
		      continue;
		    }
		    System.out.println(i + " " + n / i);
	    }
	  }
  }

}
