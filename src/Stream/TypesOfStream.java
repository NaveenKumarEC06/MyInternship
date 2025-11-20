package Stream;
import java.util.*;
import java.util.stream.*;
public class TypesOfStream {
    public static void main(String args[])
    {
        List<Integer> list=Arrays.asList(56,78,90,32,45);
        System.out.println("Sequential Stream :");
        list.stream()       //Sequential Stream
                .forEach(System.out::println);
        System.out.println("Parallel Stream :");
        list.parallelStream() //Parallel Stream
                .forEach(n -> System.out.println(n+" "+Thread.currentThread().getName()));
        System.out.println("Infinite Stream :");
        Stream.iterate(0, n->n+5) //Infinite Stream
                .limit(5)
                        .forEach(System.out::println);
        System.out.println("Primitive Stream :"); //Primitive Stream
        IntStream.range(5,9).forEach(System.out::println);
    }
}
