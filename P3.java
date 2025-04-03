
class Animal{
    void eat(){
    System.out.println("Animal eat");
}}
class Mammal extends Animal{
    void breathe(){
    System.out.println("Animal breath");
}}
class Dog extends Mammal{
    void bark(){
    System.out.println("Dog Bark");
}}
public class P3{
    public static void main(String[] args) {
        Dog obj= new Dog();
        obj.eat();
        obj.breathe();
        obj.bark();
    }
}