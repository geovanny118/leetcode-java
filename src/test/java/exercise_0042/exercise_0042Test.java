package exercise_0042;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0042.exercise_0042.trap;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0042Test {
    static int[] height1, height2;

    @BeforeAll
    static void setup(){
        height1 = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        height2 = new int[]{4,2,0,3,2,5};
    }

    @Test
    void testCase1() {
        assertEquals(6, trap(height1));
    }

    @Test
    void testCase2() {
        assertEquals(9, trap(height2));
    }
}