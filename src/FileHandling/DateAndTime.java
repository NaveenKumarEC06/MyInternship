package FileHandling;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
public class DateAndTime {

    public static void main(String args[]) throws IOException {
        int count = 1, i = 1;
        LocalDate localDate = LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println(String.valueOf(time));
        String date = String.valueOf(localDate);
        File f = new File(date);
        try {
            if (f.exists()) {
                String contents = new String(Files.readAllBytes(Paths.get(date)));
                String[] values = contents.trim().split("\\s+");
                int lastNumber = Integer.parseInt(values[values.length - 1]);
                BufferedWriter out = new BufferedWriter(new FileWriter(date, true));
                while (count <= 10) {
                    out.write(String.valueOf(lastNumber + 1) + "\n");
                    lastNumber++;
                    count++;
                }
                out.close();                count = 1;
                System.out.println(date + " : File is Written ");
            } else {
                FileWriter w2 = new FileWriter(f);
                while (count <= 10) {
                    w2.write(String.valueOf(i) + "\n");
                    i++;
                    count++;
                }
                w2.close();
                count = 1;
                System.out.println(date + " : File is Written ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
