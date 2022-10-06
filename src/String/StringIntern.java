package String;

public class StringIntern {
    public static void main (String ...args){
        String s1 = new String("hi");
        String s2 = "hi";
        String s3 = s1.intern();
        System.out.println("s1 = s2 :" + (s1 ==s2));
        System.out.println("s2 = s3 :"+ (s2==s3));
//        System.out.println(s1==s3);
    }
}
