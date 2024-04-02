import java.util.Comparator;

/**
 * Sort using insertion sort.
 *
 * @author Arsal Shaikh
 */

public class InsertionSort implements Sorter {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The one sorter you can access.
   */
  public static Sorter SORTER = new InsertionSort();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a sorter.
   */
  InsertionSort() {
  } // InsertionSort()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  @Override
  public <T> void sort(T[] values, Comparator<? super T> order) {
    // Divides the array into sorted and unsorted sections
    int outPointer = 1;

    // Used to traverse and sort the sorted portion
    int inPointer;;

    while (outPointer < values.length) {
      inPointer = outPointer - 1;
      while (inPointer > 0) {
        if (order.compare(values[inPointer], values[inPointer - 1]) > 0) {

        }
      } // while (inPointer)
    } // while (outPointer)
  } // sort(T[], Comparator<? super T>
} // class InsertionSort
