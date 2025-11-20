package Inheritance;

public class Somesh implements Parent1,Parent2{
    Somesh()
    {
        System.out.println("Somesh Adopted ");
        Parent1.parent1();
        Ramesh.ramesh();
    }
}
