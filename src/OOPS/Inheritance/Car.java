package OOPS.Inheritance;

public class Car extends Vehicles{

    public int noOfDoors;
    public String transmissionType;

    //ctor
     Car (String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
         super(name, model, noOfTyres);  //super is used to invoke Vehciles ctor
         this.noOfDoors = noOfDoors;
         this.transmissionType = transmissionType;

     }

    public void startAC (){
        System.out.println("AC started of" + name);
    }

}
