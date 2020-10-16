import org.junit.Test;
import static org.junit.Assert.*;

public class SortTest {


    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"i", "an", "egg", "have"};

        Sort.sort(input);

        assertArrayEquals(expected, input);

        //
        String[] input2 = {"one", "train", "seventeen", "zz"};
        String[] expected2 = {"zz", "one", "train", "seventeen"};

        Sort.sort(input2);

        assertArrayEquals(expected2, input2);

    }


    @Test
    public void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int expected = 0;

        int actual = Sort.findSmallest(input, 0);
        assertEquals(expected,actual);

        String[] input2 = {"five", "one", "four", "zero"};
        int expected2 = 1;

        int actual2 = Sort.findSmallest(input2, 0);
        assertEquals(expected2,actual2);

        String[] input3 = {"two", "chair", "keyboard", "pi"};
        int expected3 = 3;

        int actual3 = Sort.findSmallest(input3, 0);
        assertEquals(expected3,actual3);
    }
    @Test
    public void swap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};
        Sort.swap(input, a, b);
        assertArrayEquals(expected, input);

    }


}