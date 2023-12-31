package Stacks;

import java.util.*;

//https://leetcode.com/problems/min-stack/description
class MinStack {
    Stack<Pair> st ;
    int min;

    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (st.isEmpty()) {
            min = val;
        } else {
            min = Math.min(st.peek().y, val);
        }
        st.push(new Pair(val,min));
    }

    public void pop() {
        this.st.pop();
    }

    public int top() {
        return this.st.peek().x;
    }

    public int getMin() {
        return this.st.peek().y;
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        st.push(-3);
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.top());
        System.out.println(st.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class Pair {
    int x,y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

