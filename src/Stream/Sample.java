package Stream;
import java.util.*;
import java.util.stream.*;
public class Sample {

    public static void main(String args[]) {
        List<String> s = Arrays.asList("12", "34Kumar", "Nithish67");
        s.stream()
                .filter(suffix -> suffix.matches("\\d+"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
