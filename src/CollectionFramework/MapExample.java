package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String ...args){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100, "admit");
        map.put(101,"Vijay");
        map.put(102,"rahul");
        map.put(102,"rahul");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());
        }
    }
}
