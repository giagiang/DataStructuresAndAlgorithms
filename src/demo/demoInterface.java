package demo;
interface Animal {
    void AnimalSound();
    void sleep();
}
class Pig implements Animal {
    public void animalSound() {
        System.out.println(" the pig says : hâhhah");
    }

    @Override
    public void AnimalSound() {

    }

    public void sleep() {
        System.out.println("zzz");
    }
}
class Interface{
    public static void main(String ...orgs){
            Pig myPig = new Pig();
            myPig.animalSound();
            myPig.sleep();
        }
    }
