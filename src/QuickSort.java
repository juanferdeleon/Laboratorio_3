import java.util.ArrayList;

public class QuickSort<E> {
    private static GenericComparator comparator = new GenericComparator();
    private static int partition(int data[], int left, int right)
// pre: left <= right
// post: data[left] placed in the correct (returned) location
    {
        while (true)
        {
// move right "pointer" toward left
            while (comparator.compare(left, right) == -1 && comparator.compare(data[left], data[right]) == -1) right--;
            if (comparator.compare(left, right) == -1) swap(data,left++,right);
            else return left;
// move left pointer toward right
            while (comparator.compare(left, right) == -1 && comparator.compare(data[left], data[right]) == -1) left++;
            if ((comparator.compare(left, right) == -1)) swap(data,left++,right);
            else return right;
        }
    }

    public static void quickSort(int data[], int n)
// post: the values in data[0..n-1] are in ascending order
    {
        quickSortRecursive(data,0,n-1);
    }
    private static void quickSortRecursive(int data[],int left,int right)
// pre: left <= right
// post: data[left..right] in ascending order
    {
        int pivot; // the final location of the leftmost value
        if (comparator.compare(left, right) == 1 || comparator.compare(left, right) == 0) return;
        pivot = partition(data,left,right); /* 1 - place pivot */
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
        /* done! */
    }

    public static void swap(int data[], int i, int j)
// pre: 0 <= i,j < data.length
// post: data[i] and data[j] are exchanged
    {
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}



