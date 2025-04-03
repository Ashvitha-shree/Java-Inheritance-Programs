class 	LivingBeing{
    void display1(){
    System.out.println(" LivingBeing");
}}
class Human extends	LivingBeing{
    void display2(){
    System.out.println(" Human");
}}
class Animal extends LivingBeing{
    void display3(){
    System.out.println(" Animal");
}}
class male extends	Human{
    void display4(){
    System.out.println(" male");
}}
class Female extends Human{
    void display5(){
    System.out.println(" female");
}}

public class P8{
    public static void main(String[] args) {
        male obj1= new male();
        obj1.display1();
        obj1.display2();
        obj1.display4();
        Animal obj2= new Animal();
        obj2.display3();
        obj2.display1();
        Female obj3=new Female();
        obj3.display1();
        obj3.display2();
        obj3.display5();
        
    }

}