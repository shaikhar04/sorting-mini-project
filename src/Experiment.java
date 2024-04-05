import java.util.Arrays;

public class Experiment {

  public static void main(String[] args) { 
    String[] original = {"E", "D", "C", "B", "A"};
    // String[] expected = { "alpha", "bravo", "charlie", "delta", "foxtrot" };

    Sorter sorter = new Quicksort();
    sorter.sort(original, (x, y) -> x.compareTo(y));
    System.out.println(Arrays.toString(original));
  }
}
