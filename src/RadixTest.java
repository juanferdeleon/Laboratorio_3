import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixTest {

    @Test
    void bucketPass() {
        Comparable[] result = new Comparable[3];
        result[0] = new Numbers(2340);
        result[1] = new Numbers(3500);
        result[2] = new Numbers(2400);
        Merge.mergeSort(result, 3);
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(result[i]).trim());
        }
        Object[] expected = {2340, 2400, 3500};

        assertArrayEquals(expected, result);
    }
}