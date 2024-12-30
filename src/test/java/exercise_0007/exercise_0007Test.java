package exercise_0007;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0007.exercise_0007.reverse;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0007Test {
    static int x1, x2, x3;

    @BeforeAll
    static void setupInstance(){
        x1 = 123;
        x2 = -123;
        x3 = 120;
    }

    @Test
    void testCase1() {
        assertEquals(321, reverse(x1));
    }

    @Test
    void testCase2() {
        assertEquals(-321, reverse(x2));
    }

    @Test
    void testCase3() {
        assertEquals(21, reverse(x3));
    }
}