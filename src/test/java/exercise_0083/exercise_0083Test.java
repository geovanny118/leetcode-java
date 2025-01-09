package exercise_0083;

import org.junit.jupiter.api.Test;

import static exercise_0083.exercise_0083.deleteDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0083Test {
    @Test
    void testCase1() {
        ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode listNodeResult = new ListNode(1, new ListNode(2));

        assertEquals(listNodeResult, deleteDuplicates(listNode1));
    }

    @Test
    void testCase2() {
        ListNode listNode2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode listNodeResult = new ListNode(1, new ListNode(2, new ListNode(3)));

        assertEquals(listNodeResult, deleteDuplicates(listNode2));
    }
}