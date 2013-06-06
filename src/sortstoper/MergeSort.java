/**
 * author cranCode (Kamil Holerek)
 **/
package sortstoper;
// Imports
public class MergeSort {
  private int[] array;
  private int[] helper;
  private int number;

  public void sort(int[] values) {
    this.array = values;
    number = values.length;
    this.helper = new int[number];
    mergesort(0, number - 1);
  }

  private void mergesort(int low, int high) {
    if (low < high) {
      int middle = low + (high - low) / 2;
      mergesort(low, middle);
      mergesort(middle + 1, high);
      merge(low, middle, high);
    }
  }

  private void merge(int low, int middle, int high) {
    for (int i = low; i <= high; i++) {
      helper[i] = array[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    while (i <= middle && j <= high) {
      if (helper[i] <= helper[j]) {
        array[k] = helper[i];
        i++;
      } else {
        array[k] = helper[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      array[k] = helper[i];
      k++;
      i++;
    }
  }
}
