import java.util.Comparator;

/**
 * Sort using my custom sorting algorithm.
 *
 * @author Arsal Shaikh
 */

public class ShaikhArsalSort implements Sorter {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The one sorter you can access.
   */
  public static Sorter SORTER = new ShaikhArsalSort();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a sorter.
   */
  ShaikhArsalSort() {
  } // ShaikhArsalSort()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  @Override
  public <T> void sort(T[] values, Comparator<? super T> order) {
    boolean isSorted;
    while (true) {
      isSorted = true;

      // Traverse array
      for (int i = 0; i < values.length - 1; i++) {
        if (order.compare(values[i], values[i + 1]) > 0) {
          Helper.swap(values, i, i + 1);
          isSorted = false;
        }
      }

      if (isSorted) {
        return;
      }
    }
  } // sort(T[], Comparator<? super T>
} // class ShaikhArsalSort
