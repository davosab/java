/*
Sa se afiseze toti divizorii primi ai numarului ‘n’ dat.
*/

import java.util.Scanner;

public class P12 {
	
  static boolean prim(int x) {
	
	  for (int i = 2; i * i <= x; i++) {
	    if (x % i == 0) return false;
	  }
	  return true;
  }

  public static void main(String[] args) {
	
	  Scanner myScanner = new Scanner(System.in);
	  int n = myScanner.nextInt();
	
	  for (int i = 1; i * i <= n; i++) {
	    if (n % i == 0 && prim(i)) {

		    System.out.println(i);
		    if (i * i == n) continue;
		    if (prim(n / i)) System.out.println(n / i);
	    }
	  }
  }

}
