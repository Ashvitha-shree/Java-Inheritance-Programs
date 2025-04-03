class Person{
    void introduce(){
       System.out.println("Name: Ashvitha Shree S");
    }
}
class Student extends Person
{
    void Study(){
       System.out.println("Studying pst");
    }
}
public class P2{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.introduce();
        obj.Study();

    }

}