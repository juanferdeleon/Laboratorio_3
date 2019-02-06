public class QuickSort {

 =
    public int Sorting(int numbers[], int left, int right) {
        int pivot = numbers[right];
        int i = (left-1);
        for (int j=left; j<right; j++) {

            if (numbers[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i+1];
        numbers[i+1] = numbers[right];
        numbers[right] = temp;

        return i+1;
    }



    public void Sort(int arr[], int left, int right) {
        if (left< right) {
            int pi = Sorting(arr, left, right);
            Sort(arr, left, pi-1);
            Sort(arr, pi+1, right);
        }
    }

}
