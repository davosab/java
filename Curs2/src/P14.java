/*
Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17
sau cu 13 iar al doilea cu 19 sau cu 7.
*/

public class P14 {

  public static void main(String[] args) {

    for (int i = 13; i < 1000; i++) {
      if (i % 13 == 0 || i % 17 == 0) {
        if ((1000 - i) % 7 == 0 || (1000 - i) % 19 == 0) {
          System.out.println(i + " " + (1000 - i));
        }
      }
    }
  }
  
}
