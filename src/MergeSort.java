import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using merge sort.
 *
 * @author Arsal Shaikh
 */

public class MergeSort implements Sorter {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The one sorter you can access.
   */
  public static Sorter SORTER = new MergeSort();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a sorter.
   */
  MergeSort() {
  } // MergeSort()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  @Override
  public <T> void sort(T[] values, Comparator<? super T> order) {
    mergesort(values, 0, values.length, order);
  } // sort(T[], Comparator<? super T>

  static <T> void mergesort(T[] vals, int lo, int hi, Comparator<? super T> comparator) {
    // Base Case: only one element
    if (hi <= lo) {
      return;
    }


    int mid = (lo + hi) / 2;
    // sort left half
    mergesort(vals, lo, mid, comparator);

    // sort right half
    mergesort(vals, mid + 1, hi, comparator);

    // Merge sorted halfs
    merge(vals, lo, mid, hi, comparator);
  }


  /**
   * Merge the values from positions [lo..mid) and [mid..hi) back into
   * the same part of the array.
   *
   * Preconditions: Each subarray is sorted accorting to comparator.
   */
  static <T> void merge(T[] vals, int lo, int mid, int hi, Comparator<? super T> comparator) {
    // base case : left with two elements
      // compare the two and return the sorted array
    // recursive case : 
      // divide the array into two using lo mid hi 
      // sort left and right
      // merge the two

  
    T[] left = Arrays.copyOfRange(vals, lo, mid);
    T[] right = Arrays.copyOfRange(vals, mid, hi);
      
    int lp = 0;
    int rp = 0;
    int mergePointer = lo;
    
    while (lp < left.length && rp < right.length) {
      if (comparator.compare(left[lp], right[rp]) > 0) {
        vals[mergePointer++] = vals[rp++];
      } else {
        vals[mergePointer++] = vals[lp++];      
      } // if else

    } // while

    // if reached end of right array
    while (lp < left.length) {
      vals[mergePointer++] = left[lp++];
    } 

    // if reached end of left array
    while (rp < right.length) {
      vals[mergePointer++] = right[rp++];
    }
    } // merge
} // class MergeSort
