package firstclass;

public class firstJava {

    public static void main (String ...args){
        int i  = 10 ;
        i++;// tuong duong  i = i +1 ;
        inkq(i);
        ++i ;
        inkq(i);
        //phep thu
        i = 10 ;
        inkq(i++);
        i = 10;
        inkq(++i);

    }
     public static void inkq(int i ){
         System.out.println(i);
     }
}
