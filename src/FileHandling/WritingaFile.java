package FileHandling;
import java.util.*;
import java.io.*;
public class WritingaFile {
    public static void main(String args[]) throws IOException {
        try {
            FileWriter w = new FileWriter("Sample.txt");
            w.write("Hello :>[:]<3 Hi !!! :)  Welcome to My P_R_O_G_R_A_M   (: ");
            w.close();
            System.out.println("File is Written -o0O- ");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try{
            BufferedReader read=new BufferedReader(new FileReader("Sample.txt"));
            String line=read.readLine();
            System.out.println("The Content in the File is  :");
            System.out.println(line);
            read.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
