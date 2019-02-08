import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GnomeTest {

    @org.junit.jupiter.api.Test
    void gnomeSort() {
        Gnome sort = new Gnome();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        result.add(0, 25);
        result.add(1, 1);
        result.add(2, 90);
        result.add(3, 34);
        result.add(4, 2);

        result = sort.gnomeSort(result);
        Object[] isCompared = {1, 2, 25, 34, 90};

        assertArrayEquals(result.toArray(), isCompared);
    }
}