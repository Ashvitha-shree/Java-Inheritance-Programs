
class parent{
    void display1(){
    System.out.println("This is parent class");
}}
class child1 extends parent{
    void display2(){
    System.out.println("This is child1 class");
}}
class child2 extends parent{
    void display3(){
    System.out.println("This is child2 class");
}}
public class hierarchicalinheritance{
    public static void main(String[] args) {
        child1 obj1= new child1();
        obj1.display1();
        obj1.display2();
        child2 obj2= new child2();
        obj2.display1();
        obj2.display3();
    }
}