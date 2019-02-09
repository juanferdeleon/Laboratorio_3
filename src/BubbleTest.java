import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleTest {

    @Test
    void bubbleSort() {
        Comparable[] result = new Comparable[3];
        result[0] = new Numbers(8);
        result[1] = new Numbers(200);
        result[2] = new Numbers(25);
        Merge.mergeSort(result, 3);
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(result[i]).trim());
        }
        Object[] expected = {8, 25, 200};

        assertArrayEquals(expected, result);
    }
}