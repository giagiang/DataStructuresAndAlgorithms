package firstclass;

public class PrefixPostfix {
    public static void main(String ...args){
        int a = 0 ;
        // tuong duong i = i+1;
        a++;
        inkq(a);
        ++a;
        inkq(a);
        //
        a = 0;
        inkq(a++);
        a = 0;
        inkq(++a);
    }
    public static void inkq(int a){
        System.out.println(a);
    }
}
