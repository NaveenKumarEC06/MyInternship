package FunctionalInterface;
import java.util.*;
import java.util.function.*;
public class TypesOfInterface {
    public static void main(String args[])
    {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the User Name :");
        String s=sc.next();
        int min=1000;
        int max=10000;
        int randomNumber=r.nextInt(max-min+1)+min;
        Predicate<String> validity=user->user.length()>=5;
        if(validity.test(s))
        {
            Function<String,String> upper= st->st.toUpperCase();
            Supplier<Integer> otp=()->randomNumber;
            String str="WELCOME !!! "+upper.apply(s)+" Your OTP is "+otp.get();
            Consumer<String> f=m->System.out.println(m);
            f.accept(str);
        }
        else {
            System.out.println("Invalid Username :: Minimum length of username should be 5");
        }

    }
}
