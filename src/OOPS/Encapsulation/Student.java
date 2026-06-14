package OOPS.Encapsulation;

public class Student {
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;
    public int marks;



    public Student() {
        System.out.println("Default constructor is called");
    }

    public Student(int id, int age, String name, int nos, String gf, int marks) {
        System.out.println("Parametrised constructor is called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
        this.marks = marks;
    }

    public Student(Student srcobj) {
        System.out.println("Copy constructor is called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
        this.gf = srcobj.gf;
        this.marks = srcobj.marks;
    }

    public void study() {
        System.out.println(name + " studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

    private void gfchatting() {
        System.out.println(name + " gfchatting");
    }
}