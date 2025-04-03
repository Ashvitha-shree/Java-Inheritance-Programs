class Device{
    void charge(){
    System.out.println("All device can  be charged");
}}
class Phone extends Device{
    void Call(){
    System.out.println("Phone can make call");
}}
class Smartphone extends Phone{
    void Sim(){
    System.out.println("Smart phone have a sim");
}}
public class P4{
    public static void main(String[] args) {
        Smartphone obj= new Smartphone();
        obj.charge();
        obj.Call();
        obj.Sim();
    }
}