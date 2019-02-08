public class Bubble {

    private GenericComparator comparator = new GenericComparator();

    public int[] bubbleSort(int[] infoArray)
    {
        int n = infoArray.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (comparator.compare(infoArray[j] ,infoArray[j+1]) == 1)
                {
                    // swap temp and arr[i]
                    int tempValue = infoArray[j];
                    infoArray[j] = infoArray[j+1];
                    infoArray[j+1] = tempValue;
                }
            }
        }
        return infoArray;
    }

    /* Prints the array */
    public void printArray(int[] infoArray)
    {
        int n = infoArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(infoArray[i] + " ");
        System.out.println();
    }
}
