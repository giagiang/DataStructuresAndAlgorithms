package StackQueue;

public class ArrayStackImp {
    public static void main(String[] args){
        decTobin(11);
    }
    public static void decTobin(int k){
        ArrayStack s = new ArrayStack();
        System.out.println(k + " in binary system is: ");
        while(k>0){
            s.push(new Integer(k%2));// đưa vào stack phần du
            k = k/2;//cập nhật lại không giảm đi
        }
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("");
    }
}
