/*
Care este cel mai mic numar prim mai mare ca 1000?
*/

public class P10 {

  public static void main(String[] args) {
	
	  boolean prim = false;
	
	  for (int i = 1001; !prim; i++) {
	    prim = true;
	    for (int d = 2; d * d <= i; d++) {
		    if (i % d == 0) {
		      prim = false;
		      break;
		    }
	    }
	    if (prim) {
		    System.out.println(i);
		    return;
	    }
	  }   
  }

}
