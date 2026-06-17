//package OOPS.Abstraction;
//
//abstract class Bird{
//    abstract void fly();
//    abstract void eat();
//}
//
//class Sparrow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}
//
//class Crow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("Crow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eating");
//    }
//}
//
//
//
//public class main {
//    public static void main() {
//        Bird b = new Sparrow();
//        b.fly();
//        b.eat();
//
//        b = new Crow();
//        b.fly();
//        b.eat();
//    }
//}


//New Way
package OOPS.Abstraction;


//interface
interface Bird{
    void fly();
    void eat();
}

//implementation
class Sparrow implements Bird{


    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow Eating");
    }
}

class Crow implements Bird{


    @Override
    public void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow Eating");
    }
}



public class main {
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main() {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}