package com.java.mock;

class Stack {

    int[] arr = new int[5];
    int top = -1;

    void push(int x) {

        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = x;
        }
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int value = arr[top];
            top--;
            return value;
        }
    }

    int peek() {

        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    void display() {

        System.out.print("Stack: [");

        for (int i = 0; i <= top; i++) {

            System.out.print(arr[i]);

            if (i < top) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}

public class StackArray {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Peek: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        s.display();
    }
}