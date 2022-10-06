package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class ListInterger {
    public static void main(String ...args){
        List<String> liststring = new LinkedList<String>();
        liststring.add("one");
        liststring.add("two");
        liststring.add("three");
        liststring.add("four");
        liststring.add("five");
        liststring.add("six");
        liststring.add("seven");
        List<Integer> listInterger = new LinkedList<Integer>();
        listInterger.add(1);
        listInterger.add(9);
        listInterger.add(10);
        listInterger.add(12);
        listInterger.add(0);
        listInterger.add(3);
        listInterger.add(32);

        System.out.println("phần tử chỉ số 2 trong  list String là: ");
        String str = liststring.get(2);
        System.out.println(str);

        System.out.println("phần tử có chỉ số 4 trong list là: ");
        int number =listInterger.get(4);
        System.out.println(number);
    }
}
