/*
Sa se afiseze factorialul unui numar n citit de la tastatura. 
(FACT=1*2*3*...*n)
*/

import java.util.Scanner;

public class P8 {

  public static void main(String[] args) {
	
	  Scanner myScanner = new Scanner(System.in);
	  int n = myScanner.nextInt();
	  int sum = 1;
	
	  for (int i = 2; i <= n; i++) {
	    sum *= i;
	  }
    System.out.println(sum);
  }

}
