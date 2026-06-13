package OOPS.ObjectClasses;

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
        Student A = new Student(18, 21, "Abhay", 5);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);

        A.study();
        A.sleep();
        A.bunk();

        //Copy constructor
        Student B = new Student(A);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.nos);


    }
}
