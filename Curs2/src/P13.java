/*
Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie 
divizibil cu 17 iar al doilea cu 19.
*/

public class P13 {

  public static void main(String[] args) {

    for (int n17 = 17; n17 < 1000; n17 += 17) {
      if ((1000 - n17) % 19 == 0) {
        System.out.println(n17 + " " + (1000 - n17));
      }
    }
  }

}
