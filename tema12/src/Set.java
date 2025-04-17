import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;

public class Set {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
      String line;
      int t = Integer.parseInt(br.readLine()); // just to eliminate t from pairs
      HashSet<String> uniquePairs = new HashSet<String>();

      while ((line = br.readLine()) != null) {
        uniquePairs.add(line);
        bw.write(uniquePairs.size() + "\n");
        System.out.println(uniquePairs.size());
      }
      br.close();
      bw.close();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
