package Stream;

import java.util.*;
import java.util.stream.*;
public class Operations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 20, 10, 30, 40);
        //Stream <Integer> l=Stream.of(1,2,3,4,5); To set fixed values in the stream (3).
        //int[] a={3,4,5};
        //Stream l=new Arrays.stream(a); From Array (2).
        numbers.stream() //From Collection (1).
                .filter(n -> n >0)  // intermediate operations
                .sorted()
                .distinct()
                .map(n -> n*6)
                .forEach(System.out::println);//terminal operations
    }
}