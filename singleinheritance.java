
class parent{
    void display1(){
    System.out.println("This is parent class");
}}
class child extends parent{
    void display2(){
    System.out.println("This is child class");
}}
public class singleinheritance{
    public static void main(String[] args) {
        child obj= new child();
        obj.display1();
        obj.display2();
    }
}