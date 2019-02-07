import java.util.ArrayList;

public class QuickSort<E> {

    private  List sortedList = new List();

    private int partition(List arr, int low, int high) {
        int pivot = arr.Pop(high);
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr.Pop(j) <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr.Pop(i);
                arr.Set(i, arr.Pop(j));
                arr.Set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr.Pop(i + 1);
        arr.Set(i + 1, arr.Pop(high)) ;
        arr.Set(high, temp);
        return i + 1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public void sort(List arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        sortedList = arr;
    }

    public List SortedList() {
        return sortedList;
    }
}

