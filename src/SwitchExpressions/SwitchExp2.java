package SwitchExpressions;

import java.util.*;
import java.io.*;
public class SwitchExp2 {

    public static void print(Object b)
    {
        switch (b){
            case Integer i ->
            {
                switch (i) {
                    case Integer k when k==0 -> System.out.println("Zero");
                    case Integer k when k>0 -> System.out.println("Positive Integer : "+k);
                    default -> System.out.println("Negative Integer : " +i);
                };
            }
            case String s -> {
                switch(s){
                    case String str when str.length() >=5 -> System.out.println("Long String");
                    default -> System.out.println("Short String");
                };
            }
            case Double d -> System.out.println("Double Value :" + d);
            case null -> System.out.println("Null Value");
            default -> System.out.println("Unknown Type");
        };
        //System.out.println(st);
    }
    public static void main(String args[])
    {

        SwitchExp2 ob=new SwitchExp2();

        ob.print(90);
    }
}
