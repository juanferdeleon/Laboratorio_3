import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        QuickSort sort = new QuickSort();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0, 100);
        expected.add(1, 25);
        expected.add(2, 50);
        expected.add(3, 1);
        expected.add(4, 2);

        QuickSort.quickSort(expected, 5);
        Object[] result= {1, 2, 25, 50, 100};

        assertArrayEquals(expected.toArray(), result);
    }
}