// Prima problema
public ArrayList<String> swapFirstLast(ArrayList<String> list)
{
    if (list.size() > 0) {
      String first = list.get(0);
      String last = list.get(list.size() - 1);

      list.set(0, last);
      list.set(list.size() - 1, first);
    }
    return list;
}
