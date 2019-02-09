import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GnomeTest {

    @Test
    void gnomeSort() {
        Numbers[] numbers = new Numbers[4];
        numbers[0] = new Numbers(25);
        numbers[1] = new Numbers(2000);
        numbers[2] = new Numbers(20);
        numbers[3] = new Numbers(1);

        Gnome.gnomeSort(numbers);

        Numbers[] expected = new Numbers[4];

        expected[0] = new Numbers(1);
        expected[1] = new Numbers(20);
        expected[2] = new Numbers(25);
        expected[3] = new Numbers(2000);

        assertArrayEquals(numbers, expected);
    }
}