class Machine{
    void Poweron(){
    System.out.println("This is Machine");
}}
class Computer extends Machine{
    void runprogram(){
    System.out.println("This is  Computer");
}}
class Printer extends Machine{
    void printdocument(){
    System.out.println("This is Printer");
}}
class Laptop extends Computer{
    void carryaround(){
    System.out.println("This is Laptop");
}}
public class P7{
    public static void main(String[] args) {
        Laptop obj1= new Laptop();
        obj1.Poweron();
        obj1.runprogram();
        obj1.carryaround();
        Printer obj2= new Printer();
        obj2.Poweron();
        obj2.printdocument();
        
    }

}