/*
Sa se calculeze media aritmetica a n numere – ‘n’ citit de la tastatura
*/

import java.util.Scanner;

public class P7 {

  public static void main(String[] args) {
    
	Scanner myScanner = new Scanner(System.in);
	int n = myScanner.nextInt();
	float sum = 0f;
	
	for (int i = 0; i < n; i++) {
	  int userNr = myScanner.nextInt();
	  sum += userNr;
	}
    System.out.println(sum / n);
  }

}
