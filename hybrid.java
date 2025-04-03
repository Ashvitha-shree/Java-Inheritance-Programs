class A{
    void display1(){
    System.out.println("This is A class");
}}
class B extends A{
    void display2(){
    System.out.println("This is B class");
}}
class C extends A{
    void display3(){
    System.out.println("This is C class");
}}
class D extends B{
    void display4(){
    System.out.println("This is D class");
}}
public class hybrid{
    public static void main(String[] args) {
        D obj1= new D();
        obj1.display1();
        obj1.display2();
        obj1.display4();
        C obj2= new C();
        obj2.display3();
        obj2.display1();
        
    }

}