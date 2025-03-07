/*
Sa se genereze toate numerele de 4 cifre de forma 3a2b care se divid cu 9.
*/

public class P15 {
  
  public static void main(String[] args) {

    for (int a = 0; a <= 9; a++) {
      for (int b = 0; b <= 9; b++) {
        int nr = 3020 + a * 100 + b;
        if (nr % 9 == 0) System.out.println(nr);
      }
    }
  }
  
}
