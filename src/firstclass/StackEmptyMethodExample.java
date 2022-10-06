package firstclass;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEmptyMethodExample {
//    public static void main(String ...args){
//        //creating an instace of stack class
//        Stack<Integer> stk = new Stack<>();
//        boolean result =stk.empty();
//        System.out.println("is the stack empty?: " +result);
//        stk.push(10);
//        stk.push(19);
//        stk.push(30);
//        stk.push(80);
//        stk.push(99);
//        System.out.println("Element in stack: " + stk);
//        result = stk.empty();
//        System.out.println("is the stack empty: "+ result);
//    }


        public static void main(String args[])
        {
            //creating an object of Stack class
            Stack <Integer> stk = new Stack<>();
            System.out.println("stack: " + stk);
            //pushing elements into the stack
            pushelmnt(stk, 20);
            pushelmnt(stk, 13);
            pushelmnt(stk, 89);
            pushelmnt(stk, 90);
            pushelmnt(stk, 11);
            pushelmnt(stk, 45);
            pushelmnt(stk, 18);
            //popping elements from the stack
            popelmnt(stk);
            popelmnt(stk);
            //throws exception if the stack is empty
            try
            {
                popelmnt(stk);
            }
            catch (EmptyStackException e)
            {
                System.out.println("empty stack");
            }
        }
        //performing push operation
        static void pushelmnt(Stack stk, int x)
        {
            //invoking push() method
            stk.push(new Integer(x));
            System.out.println("push -> " + x);
            //prints modified stack
            System.out.println("stack: " + stk);
        }
        //performing pop operation
        static void popelmnt(Stack stk)
        {
            System.out.print("pop -> ");
            //invoking pop() method
            Integer x = (Integer) stk.pop();
            System.out.println(x);
            //prints modified stack
            System.out.println("stack: " + stk);
        }
}



