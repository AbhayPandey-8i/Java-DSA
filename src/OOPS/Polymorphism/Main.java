package OOPS.Polymorphism;

public class Main {
    static void main() {
//        calculator c = new calculator();
//        System.out.println(c.add(2,5));
//        System.out.println(c.add(2,5, 6));
//        System.out.println(c.add(2,5,6,6.5));


        //Runtime Polymorphism
        circle c = new circle();
//        c.draw();
        doDrawingStuff(c);


    }

    public static void doDrawingStuff(Shape s) {
       s.draw();
    }


}
