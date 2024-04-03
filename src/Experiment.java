public class Experiment {

  public static void main(String[] args) { 
    String[] original = { "foxtrot", "delta", "charlie", "bravo", "alpha" };
    String[] expected = { "alpha", "bravo", "charlie", "delta", "foxtrot" };

    InsertionSort sorter = new InsertionSort();
    sorter.sort(expected, (x, y) -> x.compareTo(y));
  }
}
