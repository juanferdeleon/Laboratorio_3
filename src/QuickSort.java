
/***
 * Universidad del Valle de Guatemala
 * Estructuras de Datos
 * Ing. Douglas Barrios
 * @author Amado Garcia 181460 / Juan Fernando De Leon Quezada 17822
 * E-Reference: Bailey(2007) Java Structures. This code was taken fromn this book
 */
public class QuickSort {
    private static int partition(Comparable data[], int left, int right)
    // pre: left <= right
    // post: data[left] placed in the correct (returned) location
    {
        while (true) {
            // move right "pointer" toward left
            while (left < right && data[left].compareTo(data[right]) == -1) right--;
            if (left < right) swap(data, left++, right);
            else return left;
            // move left pointer toward right
            while (left < right && data[left].compareTo(data[right]) == -1) left++;
            if (left < right) swap(data, left, right--);
            else return right;
        }
    }


    public static void quickSort(Comparable data[], int n)
    // post: the values in data[0..n-1] are in ascending order
    {
        quickSortRecursive(data, 0, n - 1);
    }


    private static void quickSortRecursive(Comparable data[], int left, int right)
    // pre: left <= right
    // post: data[left..right] in ascending order
    {

        int pivot;   // the final location of the leftmost value
        if (left >= right) return;
        pivot = partition(data, left, right);    /* 1 - place pivot */
        quickSortRecursive(data, left, pivot - 1); /* 2 - sort small */
        quickSortRecursive(data, pivot + 1, right);/* 3 - sort large */
        /* done! */
    }


    public static void swap(Comparable data[], int i, int j)
    // pre: 0 <= i,j < data.length
    // post: data[i] and data[j] are exchanged
    {
        Comparable temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


}
