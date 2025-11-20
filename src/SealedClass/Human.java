import java.lang.*;
public sealed class Human permits Person1,Person2,Person3{

    public void print()
    {
        System.out.println("Human");
    }
    public static void main(String args[])
    {
        Human ob=new Human();
        ob.print();
        Human p1=new Person1();
        p1.print();
        Human p2=new Person2();
        p2.print();
        Person3 p3=new Person3();
        p3.print();
        Person4 p4=new Person4();
        p4.print();
    }
}
