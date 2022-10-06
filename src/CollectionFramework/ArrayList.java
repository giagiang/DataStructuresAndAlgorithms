package CollectionFramework;

import java.util.List;

import java.util.LinkedList;

public class ArrayList {
    public static void main (String ...args) {
        List<String> al = new LinkedList<>();
        al.add("honda ");
        al.add("yamaha ");
        al.add("suzuki ");
        al.add("honda");
        System.out.println("các phần tử có trong listString là:");
        for (String element : al){
            System.out.println(element);
        }
    }
}

//public class ArrayList{
//    public static void main(String ...args){
//        LinkedList<String> ll= new LinkedList<String>();
//        ll.add("a");
//        ll.add("b");
//        ll.addFirst("e");
//        ll.addLast("L");
//        ll.add("h");
//        ll.add(2,"o");
//        System.out.println(ll);
//        ll.remove ("b");
//        ll.remove(3);
//        ll.removeFirst();
//        ll.removeLast();
//        System.out.println(ll);
//
//    }
//}