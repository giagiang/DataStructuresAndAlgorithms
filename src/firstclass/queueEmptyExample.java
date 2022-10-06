package firstclass;

import java.util.LinkedList;
import java.util.Queue;

public class queueEmptyExample {
    public static void main (String...args){
        Queue<Integer>queueOne= new LinkedList<>();
        queueOne.add(6);
        queueOne.add(5);
        queueOne.add(9);
        queueOne.add(11);
        queueOne.add(90);
        System.out.println("Example Width add method the queue is: "+queueOne);
        Queue<String> queueTwo = new LinkedList<>();
        queueTwo.offer("one");
        queueTwo.offer("Two");
        queueTwo.offer("Three");
        queueTwo.offer("Four");
        queueTwo.offer("Five");
        System.out.println("Example with Offer method The queue is: " + queueTwo);

    }
}


