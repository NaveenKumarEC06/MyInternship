import java.util.*;
public class Marks extends Student {
    public static double total=0.0,avg=0.0;
    public static void calculate() {

        Student s=new Student();
        total=s.getScience()+s.getMaths()+s.getSocial();
        System.out.println("Student Name : "+s.getname());
        System.out.println("Total Marks :"+total);
        avg=total/3;
        System.out.println("Percentage : "+avg);
    }

    public static void status()
    {
        if(total<=39)
            System.out.println("FAIL");
        else if(total>=40)
            System.out.println("PASS");
    }
    public static void rank()
    {
        if(avg<=100&&avg>=90)
            System.out.println("Rank : O");
        else if(avg<=89&&avg>=80)
            System.out.println("Rank : A+");
        else if(avg<=79&&avg>=70)
            System.out.println("Rank : A");
        else if(avg<=69&&avg>=60)
            System.out.println("Rank : B+");
        else if(avg<=59&&avg>=50)
            System.out.println("Rank : B");
        else if(avg<=49&&avg>=40)
            System.out.println("Rank : C");
        else
            System.out.println("Rank : U");
    }
    /*public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Name :");
        name=sc.nextLine();
        System.out.println("Enter your Science,Maths and Social Marks :");
        Science=sc.nextInt();
        Maths=sc.nextInt();
        Social=sc.nextInt();
        Marks ob=new Marks();
        ob.setName(name);
        ob.setMaths(Maths);
        ob.setScience(Science);
        ob.setSocial(Social);
        ob.calculate();

    }*/
}