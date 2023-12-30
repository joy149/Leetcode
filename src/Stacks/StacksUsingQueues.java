package Stacks;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/description/
/*
* Here we are implementing stacks (LIFO) using two queues (FIFO).
* Following the below steps:
* Add x -> q2
* q1 -> q2 (element by element transfer)
* swap (q1 & q2)
* */
public class StacksUsingQueues {

    Queue<Integer> q1 , q2;

    public StacksUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = new LinkedList<>();
        temp = q1;
        q1 = q2;
        q2 = temp;

    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StacksUsingQueues st = new StacksUsingQueues();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());

    }
}
