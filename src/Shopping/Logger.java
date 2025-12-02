package Shopping;

import java.util.Random;
import java.util.UUID;

public class Logger {
    private static String id= UUID.randomUUID().toString();

    public static void print(String s)
    {
        System.out.println(id+" "+s);
    }
}
