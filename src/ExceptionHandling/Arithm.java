package ExceptionHandling;
import java.util.*;
import java.io.*;
public class Arithm {
    public static void main(String args[])
    {
        int CurrentYear=2025;
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Name :");
            String name=sc.nextLine();
            System.out.println("Enter the Birth Year :");
            String y=sc.next();
            int year=Integer.parseInt(y);
            int age=2025-year;
            if(age<0)
                throw new ArithmeticException();
        }
        catch(NumberFormatException e)
        {
            System.out.println("This is not a number...");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Age should not be in negative integer;Enter the correct birth year ");
        }
        finally {
            System.out.println("This is the Age generation program");
        }
    }
}
