import java.util.ArrayList;

public class QuickSort<E> {
    private static GenericComparator comparator = new GenericComparator();
    private static int partition(ArrayList<Integer> data, int left, int right)
// pre: left <= right
// post: data[left] placed in the correct (returned) location
    {
        while (true)
        {
// move right "pointer" toward left
            while (comparator.compare(left, right) == -1 && comparator.compare(data.get(left), data.get(right)) == -1) right--;
            if (comparator.compare(left, right) == -1) swap(data,left++,right);
            else return left;
// move left pointer toward right
            while (comparator.compare(left, right) == -1 && comparator.compare(data.get(left), data.get(right)) == -1) left++;
            if ((comparator.compare(left, right) == -1)) swap(data,left++,right);
            else return right;
        }
    }

    public static void quickSort(ArrayList data, int n)
// post: the values in data[0..n-1] are in ascending order
    {
        quickSortRecursive(data,0,n-1);
    }
    private static void quickSortRecursive(ArrayList data ,int left,int right)
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

    private static void swap(ArrayList<Integer> data , int i, int j)
// pre: 0 <= i,j < data.length
// post: data[i] and data[j] are exchanged
    {
        int temp;
        temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}



