/*
Sa se citeasca de la tastatura un numar. Daca este cuprins intre 1 si 5 sa 
se afiseze numarul respectiv dar in litere. Daca este in afara intervalului 
sa se afiseze INVALID.
 */

import java.util.*;

public class P2 {

  public static void main(String[] args) {

	List<String> nrs = List.of("UNU", "DOI", "TREI", "PATRU", "CINCI");
	Scanner myScanner = new Scanner(System.in);
	int userNr = myScanner.nextInt();
	
	if (userNr < 1 || userNr > 5) {
		System.out.println("INVALID");
		return;
	}
	
	System.out.println(nrs.get(userNr - 1));
  }

}
