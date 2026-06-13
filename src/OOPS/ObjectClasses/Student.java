package OOPS.ObjectClasses;

public class Student {

    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default constructor -- Makes code bulky and messy
    public Student() {
        System.out.println("Default constructor is called");
    }

    //Parameterised Constructor
    public Student(int id, int age, String name, int nos) {
        System.out.println("Parametrised constructor is called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Copy construcor
    public Student(Student srcobj) {
        System.out.println("Copy constructor is called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }


    //Methods or Behaviour
    public void study() {
        System.out.println(name + "studying");
    }

    public void sleep() {
        System.out.println(name + "sleeping");
    }

    public void bunk() {
        System.out.println(name + "bunking");
    }

}
