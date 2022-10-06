package StackQueue;

import java.util.LinkedList;

public class LinkedListStack {
    LinkedList h ;
    public LinkedListStack(){
        h = new LinkedList();
    }
    public boolean isEmpty(){
        return h.isEmpty();
    }
    public void push(Object x){
        h.addLast(x);
    }
    public Object pop(){
        if (isEmpty()) return null;
        return h.removeLast();
    }
}
