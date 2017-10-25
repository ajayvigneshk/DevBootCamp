package com.company;

import java.util.LinkedList;
import java.util.List;

public class MyStack<E> {
    private List<E> stack = new LinkedList<>();

    public boolean add(E elem) {
        return stack.add(elem);
    }

    public int size() {
        return stack.size();
    }

    public E pop() {
        return stack.get(stack.size()-1);
    }

    public static void main (String... args) {
        MyStack<Integer> integerMyStack = new MyStack<>();
        integerMyStack.add(5);
        integerMyStack.add(6);
        integerMyStack.add(7);
        System.out.println(integerMyStack.size());
        System.out.println(integerMyStack.pop());
    }
}
