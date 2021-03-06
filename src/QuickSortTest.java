import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        Comparable[] result = new Comparable[3];
        result[0] = new Numbers(200);
        result[1] = new Numbers(3000);
        result[2] = new Numbers(2);
        QuickSort.quickSort(result, 3);
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(result[i]).trim());
        }
        Object[] expected = {2, 200, 3000};

        assertArrayEquals(expected, result);
    }
}