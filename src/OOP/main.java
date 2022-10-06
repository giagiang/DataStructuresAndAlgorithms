package OOP;

abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("hihiihihiihh");
    }
}
class Pig extends Animal {
    public void animalSound(){
        System.out.println("the pig says :: hêhheheh");
    }
}

class Tiger extends Animal{
    public void animalSound(){
        System.out.println("the tiger says :: hết bia ");
    }
}
class human extends Animal{
    public void animalSound(){
        System.out.println("the human race: i really want a see you, but i know ");
    }
}
public class main {
    public static void main (String ...args){
         Pig myPig  = new Pig();
         myPig.animalSound();
         myPig.sleep();
         Tiger tg = new Tiger();
         tg.animalSound();
         human hm = new human();
         hm.animalSound();
    }
}