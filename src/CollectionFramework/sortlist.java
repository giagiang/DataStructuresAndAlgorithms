package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortlist {
    public static void main(String ...args){
        List<String> listString = new ArrayList<String>();
        listString.add("a");
        listString.add("g");
        listString.add("f");
        listString.add("d");
        listString.add("t");
        listString.add("e");
        listString.add("f");
        Collections.sort(listString);
        System.out.println("cacs phan tu trong listString sau khi sap xep: ");
        for (String str : listString){
            System.out.println(str);
        }
    }
}
