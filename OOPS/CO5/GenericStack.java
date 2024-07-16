//Program to create a generic stack and do the Push and Pop operations

import java.util.*;

class Stack<T> {
    private ArrayList<T> A;
    private int top = -1;
    private int size;

    Stack(int size) {
        this.size = size;
        this.A = new ArrayList<>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            if (A.size() > top) {
                A.set(top, X);
            } else {
                A.add(X);
            }
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return A.get(top);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    boolean empty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < top; i++) {
            ans.append(A.get(i)).append(" -> ");
        }
        if (top != -1) {
            ans.append(A.get(top));
        }
        return ans.toString();
    }
}

public class GenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max size of stack: ");
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>(n);
        int value;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            value = scanner.nextInt();
            stack.push(value);
        }
        System.out.println("\nStack after pushing " + n + " elements:\n" + stack);

        stack.pop();
        System.out.println("\nStack after pop:\n" + stack);

        scanner.close();
    }
}
