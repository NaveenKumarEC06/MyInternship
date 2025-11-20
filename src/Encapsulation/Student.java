import java.util.*;
public class Student {
    public static String name;
    public static int Science,Maths,Social;
    public static double total;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setScience(int Science)
    {
        this.Science=Science;
    }
    public void setMaths(int Maths)
    {
        this.Maths=Maths;
    }
    public void setSocial(int Social)
    {
        this.Social=Social;
    }
    public String getname()
    {
        return name;
    }
    public int getScience()
    {
        return Science;
    }
    public int getMaths()
    {
        return Maths;
    }
    public int getSocial()
    {
        return Social;
    }
    public static void main(String args[])
    {

        Marks ob=new Marks();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Name :");
        name=sc.nextLine();
        System.out.println("Enter your Science,Maths and Social Marks :");
        Science=sc.nextInt();
        Maths=sc.nextInt();
        Social=sc.nextInt();
        ob.setName(name);
        ob.setMaths(Maths);
        ob.setScience(Science);
        ob.setSocial(Social);
        //Marks k=new Marks();
        ob.calculate();
        ob.rank();
        ob.status();

    }
}
