import java.util.ArrayList;

public class Swap {
  /*** Metoda ⇓ ***/
  public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
    if (list.size() == 0) return list;

    String first = list.get(0);
    String last = list.get(list.size() - 1);

    list.set(0, last);
    list.set(list.size() - 1, first);
    return list;
  }

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("hello");
    myList.add("world");
    System.out.println(Swap.swapFirstLast(myList));
  }
}
