import java.util.Comparator;

/**
 * Sort using Quicksort.
 *
 * @author Your Name Here
 */

public class Quicksort implements Sorter {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The one sorter you can access.
   */
  public static Sorter SORTER = new Quicksort();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a sorter.
   */
  Quicksort() {
  } // Quicksort()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Sort an array in place.
   *
   * @param vals, an array to sort.
   * @param order, the order by which to sort the values.
   * @return
   *    The same array, now sorted.
   * @pre
   *    order can be applied to any two values in vals.
   * @pre
   *    VALS = vals.
   * @post
   *    vals is a permutation of VALS.
   * @post
   *    For all i, 0 < i < vals.length,
   *      order.compare(vals[i-1], vals[i]) <= 0
   */

  @Override
  public <T> void sort(T[] values, Comparator<? super T> order) {
    int pivot = partition(values, order);
  } // sort(T[], Comparator<? super T>

  /**
   * Partition an array.
   */
  public <T> void partition(T[] values, Comparator<? super T> order) {
    partition(values, order, 0, values.length);
  } // partition(T[], Comparator<? super T>)

  // +----------------------+----------------------------------------
  // | Semi-private methods |
  // +----------------------+

  /**
   * Sort the subarray of T given by [lb..ub) in place using
   * the Quicksort algorithm.
   */
  public static <T> void quicksort(T[] values, Comparator<? super T> order,
      int lb, int ub) {
    // STUB
  } // quicksort(T[], Comparator<? super T>, lb, ub)

  /**
   * Select a pivot and partition the subarray from [lb .. ub) into 
   * the following form.
   *
   * <pre>
   * ---+-----------------+-+----------------+---
   *    | values <= pivot |p| values > pivot |
   * ---+-----------------+-+----------------+---
   *    |                 |                  |
   *    lb                pivotLoc           ub
   * </pre>
   *
   * @return pivotLoc.
   */
  public static <T> int partition(T[] arr, Comparator<? super T> order, int lb, int ub) {
    int pivot = (lb + ub) / 2;
    int large = ub;
    int small = lb;

    // pivot swap
    Helper.swap(arr, small, pivot);
    small = pivot + 1;
    pivot = lb;

    while (small != large) {
      // compare with small
      if (order.compare(arr[pivot], arr[small]) <= 0) {
        Helper.swap(arr, small, large - 1);
        large--;
      } else {
        small++;
      }

      // compare with large
      if (order.compare(arr[pivot], arr[large - 1]) < 0) {
        large--;
      } else {
        Helper.swap(arr, small, large - 1);
        small++;
      }
    } // while

    // pivot unswap
    Helper.swap(arr, small, pivot);
    pivot = small;

    return pivot;
  } // partition(T[], Comparator<? super T>, lb, ub)

} // class Quicksort
