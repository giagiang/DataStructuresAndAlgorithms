package String;

public class StringImmutable {
//    public static void main (String ...args){
//        String s1 = "hehehhehe ";
//        s1 = s1.concat("giang oi");//gán tham chiếu rõ ràng sẽ trỏ tới hêhhehh
//        System.out.println(s1 );
//    }
    public static void main(String ...args){
        String s = "sachin";
        s.concat ("hêhhehe");// nối sachin vào hêhheh
        System.out.println(s);// Chỉ in ra Sachin bởi vì string là immutable object
    }
}
