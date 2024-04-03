public class Helper {
  public static <T> T[] swap(T[] arr, int index1, int index2) {
    T temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;

    return arr;
  } // swap(T[], int, int)
} // class Helper
