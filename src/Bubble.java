import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bubble {

    private GenericComparator comparator = new GenericComparator();

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> infoArray)
    {
        int n = infoArray.size();

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (comparator.compare(infoArray.get(j) ,infoArray.get(j + 1)) == 1)
                {
                    // swap temp and arr[i]
                    int tempValue = infoArray.get(j);
                    infoArray.set(j, infoArray.get(j + 1));
                    infoArray.set(j + 1, tempValue);
                }
            }
        }
        return infoArray;
    }

    /* Prints the array */
    public void printArray(ArrayList infoArray)
    {
        int n = infoArray.size();
        for (int i=0; i<n; ++i)
            System.out.print(infoArray.get(i) + " ");
        System.out.println();
    }
}
