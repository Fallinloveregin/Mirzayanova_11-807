package com.company.brackets.linked_stack;

public class Maiin {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push('a');
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
