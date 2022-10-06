package CollectionFramework;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDifferent {
//    public static void main(String ...args){
//        List<Integer> number = Arrays.asList(19,20,34,55,55,5);
//        List<Integer> square = number.stream().map(list -> list*99).collect(Collectors.toList());
//        System.out.println(square);
//    }

public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    int sum = list.stream()
            .filter(value -> value > 0)
            .mapToInt(value -> value)
            .sum();
    System.out.println(sum);
}


//    public static void main(String []args){
//        System.out.println("the stream after applying "+ "the function is: ");
//        List<String>list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ","Computer", "Science", "gfg");
//        list.stream().map(String->String.length()).forEach(System.out::println);
//        System.out.println(answer);
//    }


//public static void main(String ...args){
//    List<String> list = Arrays.asList("cho", "meo","lon", "ga","ho", "bao");
//    List<String> result= list.stream().filter(String -> String.length()>2).collect(Collectors.toList());
//    System.out.println(result);
//    }



//    public static void main(String ...args){
//        Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
//        stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
//
//    }



//public static void main(String[] args) {
//    String str = "gEeks";
//    System.out.println(str.charAt(0)); // g
//    System.out.println(str.charAt(1)); // E
//    System.out.println(str.charAt(2)); // e
//}



//    public static void main (String ...args){
//        Stream<String> stream  = Stream.of(" Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");
//        stream.filter(str -> str.endsWith("s")).forEach(System.out::println);
//    }

//public static void main (String ...args){
//    List<Integer>list = Arrays.asList(-9,-11,-50,9,0,50);
//    System.out.println("the sorted stream is: ");
//    list.stream().sorted().forEach(System.out::println);
//}

//  public static void main(String ...args){
//        List<String> list = Arrays.asList("Geeks", "for","GeeksQuiz", "GeeksforGeeks", "GFG");
//        System.out.println("the sorted stream is: ");
//        list.stream().sorted().forEach(System.out::println);
//    }
}




