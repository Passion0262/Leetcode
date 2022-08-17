package offer.day1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer 30. 包含min函数的栈
 */
public class MinStack {

    Deque<Integer> deque;
    Deque<Integer> minDeque;
    /** initialize your data structure here. */
    public MinStack() {
        deque = new LinkedList<>();
        minDeque = new LinkedList<>();
        minDeque.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        deque.push(x);
        minDeque.push(Math.min(minDeque.peek(),x));
    }

    public void pop() {
        deque.poll();
        minDeque.poll();
    }

    public int top() {
        return deque.peek();
    }

    public int min() {
        return minDeque.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("min: " + minStack.min());
        minStack.pop();
        System.out.println("top: " + minStack.top());
        System.out.println("min: " + minStack.min());
    }


    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */
}
