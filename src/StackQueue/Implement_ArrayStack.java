package StackQueue;

import java.util.Scanner;

public class Implement_ArrayStack {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        ArrayStack at = new ArrayStack();
        for(int i = 0; i<20;i++){
            at.push(i);
        }
        at.printStack();
        at.push(100);
        System.out.println("\n-----");
        at.printStack();

    }

}
