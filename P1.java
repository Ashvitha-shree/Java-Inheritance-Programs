class Vehicle{
    void start(){
       System.out.println("Vehicle run with Petrol or diesel");
    }
}
class Car extends Vehicle
{
    void drive(){
       System.out.println("It has 4 wheels");
    }
}
public class P1{
    public static void main(String[] args) {
        Car obj=new Car();
        obj.start();
        obj.drive();

    }

}