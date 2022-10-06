package OOP;

public class Polymorphism {
    public void render(){
        System.out.println("renderring polygon...");
    }
}
class Square extends Polymorphism{
    @Override
    public void render(){
        System.out.println("rendering Square.... ");
    }
}
class circle extends Polymorphism{
    @Override
    public void render(){
        System.out.println("Renderring circle");
    }
}
class Main {
    public  static void main(String []args){
        Square s1 = new Square();
        s1.render();
        circle c1 = new circle();
        c1.render();
    }
}
