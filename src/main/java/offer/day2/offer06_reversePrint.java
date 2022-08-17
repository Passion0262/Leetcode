package offer.day2;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class offer06_reversePrint {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        while (head != null){
            deque.push(head.val);
            head = head.next;
        }
        int length = deque.size();
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = deque.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        offer06_reversePrint a = new offer06_reversePrint();

    }
}
