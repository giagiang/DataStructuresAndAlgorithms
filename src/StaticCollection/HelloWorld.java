package StaticCollection;

public class HelloWorld {
    public static void main(String ...args){
        Student a = new Student("giang", 22, 180);
        System.out.println("University (from Class):"+Student.UniversityName);
        System.out.println("University (from intance)"+ a.UniversityName);
        System.out.println("Total(from Class): "+Student.total );
        Student b  = new Student("ly", 23, 119);
        System.out.println("total(from instance):"+b.total);
    }
}
