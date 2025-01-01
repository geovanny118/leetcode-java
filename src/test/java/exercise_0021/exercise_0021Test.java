package exercise_0021;

import org.junit.jupiter.api.Test;

import static exercise_0021.exercise_0021.mergeTwoLists;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0021Test {

    @Test
    void testCase1() {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNodeResult = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        assertEquals(listNodeResult, mergeTwoLists(listNode1, listNode2));
    }

    @Test
    void testCase2() {
        ListNode listNode1 = null;
        ListNode listNode2 = null;

        assertNull(mergeTwoLists(listNode1, listNode2));
    }

    @Test
    void testCase3() {
        ListNode listNode1 = null;
        ListNode listNode2 = new ListNode(0);
        ListNode listNodeResult = new ListNode(0);

        assertEquals(listNodeResult, mergeTwoLists(listNode1, listNode2));
    }
}