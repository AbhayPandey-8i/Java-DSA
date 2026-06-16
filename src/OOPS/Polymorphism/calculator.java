package OOPS.Polymorphism;

public class calculator {
    int add(int a, int b){
        return a+b;
    }

    //method overloading
    int add(int a, int b, int c){
        return a+b+c;
    }

    double add (int a, int b, int c, double d){
        return a+b+c+d;
    }

}
