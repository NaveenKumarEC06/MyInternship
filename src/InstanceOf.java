import java.util.*;
import java.lang.*;
public class InstanceOf {
    public static void main(String args[]) {
        String ob = "1";
        if (ob instanceof String s) { //Pattern Matching of instanceof Keyword
            //String s = (String) ob;
            switch (s) {
                case "2" -> System.out.println("world"); // Enhancement of Switch expressions.
                case "1" -> System.out.println("hello");
            };
            //System.out.println(result);
        }
    }
}
