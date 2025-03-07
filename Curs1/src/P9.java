/*
Sa se verifice daca un numar n diferit de 0 sau 1 este prim sau nu.
*/

import java.util.Scanner;

public class P9 {

  public static void main(String[] args) {
	
	Scanner myScanner = new Scanner(System.in);
	int n = myScanner.nextInt();
	boolean prim = true;
	
	for (int i = 2; i * i <= n; i++) {
	  if (n % i == 0) {
		prim = false;
		break;
	  }
	}
    System.out.println(prim);
  }

}
