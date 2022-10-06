package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String ...args){
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        System.out.println(set);
    }
}
