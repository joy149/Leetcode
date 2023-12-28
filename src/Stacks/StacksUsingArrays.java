package Stacks;

public class StacksUsingArrays {
    int[] arr;
    int capacity;
    int top = -1;

    public StacksUsingArrays(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }
    public StacksUsingArrays() {
        //initializing stack with default capacity
        arr = new int[5];
    }
     public int peek() {
        return this.arr[top];
     }

     public int pop () {
        int topVal = peek();
        this.top--;
        return topVal;
     }

     public void push (int val) {

            this.top++;
            arr[this.top] = val;

     }
     public int size() {
        return this.top + 1;
     }

    public static void main(String[] args) {
        StacksUsingArrays st = new StacksUsingArrays();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}
