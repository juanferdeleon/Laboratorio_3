import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {

    @org.junit.jupiter.api.Test
    void sort() {
        Comparable[] result = new Comparable[3];
        result[0] = new Numbers(10);
        result[1] = new Numbers(25);
        result[2] = new Numbers(2);
        Merge.mergeSort(result, 3);
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(result[i]).trim());
        }
        Object[] expected = {2, 10, 25};

        assertArrayEquals(expected, result);
    }
}