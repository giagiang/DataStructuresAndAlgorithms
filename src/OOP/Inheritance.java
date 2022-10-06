package OOP;

public class Inheritance {
    int a ;
    public void addition(int x , int y ){
        a  = x+ y ;
        System.out.println("the sum of the given number:"+ a);

    }
    public void pheptru(int x, int y ){
        a = x - y ;
        System.out.println("the differents benwen the given number :" +a);
    }
}
class My_Calculation extends Inheritance{
    public void multiplication (int x, int y){
        a = x *y;
        System.out.println("the product of the given numbers: "+a);
    }
    public static void main(String ...args){
        int b = 20 , c = 50;
        My_Calculation myCal = new My_Calculation();
        myCal.addition(b,c);
        myCal.pheptru(b,c);
        myCal.multiplication(b,c);
    }
}