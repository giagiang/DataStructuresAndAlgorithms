package AnimalService;

public class AnimalServiceImp implements Animal{


    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void edit() {
        System.out.println("edit");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
