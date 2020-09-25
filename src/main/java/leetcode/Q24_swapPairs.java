package leetcode;

import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/5 2:34 下午
 * @modified By：
 */

public class Q24_swapPairs {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
