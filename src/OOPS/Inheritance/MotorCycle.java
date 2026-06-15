package OOPS.Inheritance;

public class MotorCycle extends Vehicles{
    public String handleBarType;
    public String suspensionType;

    //ctor
    MotorCycle(String name, String model, int noOfTyres, String handleBarType, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarType = handleBarType;
        this.suspensionType = suspensionType;
    }

    public void wheelie (){
        System.out.println("Motorcycle is doing wheelie!" + name);
    }

}