package FunctionalInterface;

import java.util.function.*;
import java.util.*;
public class Marks{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n=85;
        Predicate<Double> s= marks->marks>=85; // Accept one Argument and return boolean value
        System.out.println(s.test(n));
        Consumer<Double> k=p->System.out.println("CGPA :"+p/10); // Only accept the value it doesnot return any value
        k.accept(n);
        Supplier<Double> con=()->3.14;
        System.out.println("Default Value : "+con.get());//Only returns a value without accepting any value
        Function<Double,String> c= marks ->{
            if(marks>=45&&marks<=50)
                return "PASS , GRADE : C";
            else if(marks>=51&&marks<=70)
                return "PASS , GRADE : B";
            else if(marks>=71&&marks<=90)
                return "PASS , GRADE : A";
            else if(marks>=91&&marks<=100)
                return "PASS , GRADE : O";
            else return "FAIL , GRADE : U";
        };
                System.out.println(c.apply(n));
    }
    }
