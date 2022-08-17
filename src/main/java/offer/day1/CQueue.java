package offer.day1;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class CQueue {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.empty()){
            if (inStack.empty()){
                return -1;
            } else {
                in2out();
            }
        }
        return outStack.pop();
    }

    private void in2out(){
        while (!inStack.empty()){
            outStack.push(inStack.pop());
        }
    }
}
