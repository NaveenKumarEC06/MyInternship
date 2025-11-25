import java.util.*;
import java.lang.*;

record Employee(String name,int id)         //Record used to construct the constructors,accessors automatically
{
    public Employee{
        if(id<=0)
        {
            throw new IllegalArgumentException("Id must be positive");
        }
    }
}
public class Records{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name  :");
        String n=sc.nextLine();
        System.out.println("Enter the id  :");
        int id=sc.nextInt();
        Employee emp=new Employee(n,id);
        System.out.println(emp.toString());// equals(),toString(),hashCode() functions in the Employee record
    }
}
