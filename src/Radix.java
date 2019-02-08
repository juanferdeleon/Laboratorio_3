import java.util.ArrayList;
import java.util.Arrays;

public class Radix<E> {
    private static GenericComparator comparator = new GenericComparator();
    // A utility function to get maximum value in arr[]
    static int getMax(ArrayList<Integer> arr, int n)
    {
        int mx = arr.get(0);
        for (int i = 1; i < n; i++)
            if (comparator.compare(arr.get(i), mx) == 1)
                mx = arr.get(i);
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(ArrayList<Integer> arr, int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr.get(i)/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr.get(i)/exp)%10 ] - 1] = arr.get(i);
            count[ (arr.get(i)/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr.set(i, output[i]);
    }

    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(ArrayList<Integer> arr, int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
}
