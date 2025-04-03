class Shape{
    void display1(){
    System.out.println("Type of shape:");
}}
class Circle extends Shape{
    void drawcircle(){
    System.out.println("Circle");
}}
class rectangle extends Shape{
    void drawrectangle(){
    System.out.println("Rectangle");
}}
public class P5{
    public static void main(String[] args) {
        Circle obj1= new Circle();
        obj1.display1();
        obj1.drawcircle();
        rectangle obj2= new rectangle();
        obj2.display1();
        obj2.drawrectangle();
    }
}