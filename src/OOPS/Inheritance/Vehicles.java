package OOPS.Inheritance;

public class Vehicles {
    public String name;
    public String model;
    public int noOfTyres;

    //Default constructor
    Vehicles() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    //parametrised constructor
    Vehicles(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;

    }

    void startEngine(){
        System.out.println("Engine is starting of:" + name + model);
    }
    void stopEngine(){
        System.out.println("Engine has stopped of:" + name + model);
    }

}



