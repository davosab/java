/*
Sa se citeasca de la tastatura un numar. Daca este mai mare decat 5 sa se 
afiseze pe ecran cuvantul ADMIS iar daca e mai mic sa se afiseze RESPINS. 
Daca numarul este mai mic decat 1 si mai mare decat 10 sa se afiseze INVALID.
*/

import java.util.Scanner;

public class P1 {

  public static void main(String[] args) {
	  
	  Scanner myScanner = new Scanner(System.in);
	  int userNr = myScanner.nextInt();
	  String result = "INVALID";
	
	  if (userNr > 0 && userNr < 11) {
	    result = userNr > 5 ? "ADMIS" : "RESPINS";
	  }

	  System.out.println(result);
  }
  
}
