package ExceptionHandling;
import java.util.*;
import java.io.*;
public class Arithm {
    public static void validate(int age) throws InvalidAgeException{
        if(age<18)
        {throw new InvalidAgeException("Not Eligible to Vote");}
        System.out.println("Eligible to Vote");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name=sc.nextLine();
        System.out.println("Enter the Birth Year :");
        String y=sc.next();
        int year=Integer.parseInt(y);
        int age=2025-year;
        try{
            if(age<0)
                throw new ArithmeticException();
            else
                validate(age);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Age should not be in negative integer;Enter the correct birth year ");
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Vote Eligibility Checking Program");
        }
    }
}
