package OOPS.Encapsulation;

public class App {
    static void main() {

        //Default Constructor
//        Student A = new Student();
//        A.id = 18;
//        A.age = 21;
//        A.name = "Abhay";
//        A.nos = 5;
//
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.nos);
//
//        A.study();
//        A.sleep();
//        A.bunk();

        //Parameterised Constructor
        Student A = new Student(18, 21, "Abhay", 5, "soon", 66);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);
        System.out.println(A.gf); //private hence cannot be accessed, Encapsulation
        System.out.println(A.marks);

        A.study();
        A.sleep();
        A.bunk();

        //Copy constructor
        OOPS.Encapsulation.Student B = new Student(A);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.nos);



}

}
