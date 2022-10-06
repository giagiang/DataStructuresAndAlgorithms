package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class containsListSearch {
    public static void main(String ...args){
        List<String> listString  = new ArrayList<String>();

        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");
        listString.add("six");
        if(listString.contains("six")){
            System.out.println(" cos phan tu six trong listString");
        }else {
            System.out.println("khong tim thay phan tu six.");
        }

    }
}
