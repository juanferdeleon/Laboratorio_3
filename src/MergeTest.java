import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {

    @org.junit.jupiter.api.Test
    void sort() {
        Merge merge = new Merge();
        ArrayList<Integer> infoArray = new ArrayList<>();
        infoArray.add(2);
        infoArray.add(6);
        infoArray.add(10);
        infoArray.add(8);
        infoArray.add(20);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(6);
        infoArray.add(10);
        expected.add(8);
        expected.add(20);

        infoArray = merge.sort(infoArray);

        assertArrayEquals(infoArray.toArray(), expected.toArray());
    }
}