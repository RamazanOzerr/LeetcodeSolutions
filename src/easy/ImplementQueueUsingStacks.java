package easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> mainStack, copyStack;
    public ImplementQueueUsingStacks() {
        mainStack = new Stack<>();
        copyStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
    }

    public int pop() {
        int size = mainStack.size();
        for(int i = 0; i < size - 1; i++){
            int temp = mainStack.pop();
            System.out.println(temp);
            copyStack.push(temp);
        }
        System.out.println("");
        int res = mainStack.pop();
        int size2 = copyStack.size();
        for(int i = 0; i < size2; i++){
            mainStack.push(copyStack.pop());
        }
        return res;
    }

    public int peek() {
        int size = mainStack.size();
        for(int i = 0; i < size - 1; i++){
            copyStack.push(mainStack.pop());
        }
        int res = mainStack.pop();
        copyStack.push(res);
        for(int i = 0; i < size; i++){
            mainStack.push(copyStack.pop());
        }
        return res;
    }

    public boolean empty() {
        return mainStack.isEmpty();
    }
}

/*
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

