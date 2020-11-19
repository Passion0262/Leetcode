package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/11/13 11:13 上午
 * @modified By：
 */
public class Q328_oddEvenList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head==null)
            return null;
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode even_head = even;
        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = even_head;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

    }
}
