
class grandparent{
    void display1(){
    System.out.println("This is grandparent class");
}}
class parent extends grandparent{
    void display2(){
    System.out.println("This is parent class");
}}
class child extends parent{
    void display3(){
    System.out.println("This is child class");
}}
public class multilevelinheritance{
    public static void main(String[] args) {
        child obj= new child();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}