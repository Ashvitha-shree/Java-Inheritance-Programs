class Employee{
    void work(){
    System.out.println("Type of Employee");
}}
class Manager extends Employee{
    void display1(){
    System.out.println("Manager");
}}
class Developer extends Employee{
    void display2(){
    System.out.println("Developer");
}}
public class P6{
    public static void main(String[] args) {
        Manager obj1= new Manager();
        obj1.work();
        obj1.display1();
        Developer obj2= new Developer();
        obj2.work();
        obj2.display2();
    }
}