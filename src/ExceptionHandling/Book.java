package ExceptionHandling;
import java.util.*;
import java.util.*;
public class Book {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        int qty=0;
        double amt = 0.0;
        int[] avqty={12,7,4,9,1,15,10,6};
        double[] price={110,70,150,210,190,175,80,85};
        System.out.println("Enter the Book ID : ");
        try{
            id=sc.nextInt();
            if(id<=0&&id>8)
                throw new ArrayIndexOutOfBoundsException();
            System.out.println("Enter Quantity : ");
            qty=sc.nextInt();
            if(qty>avqty[id-1])
                throw new ArithmeticException();
            avqty[id-1]=avqty[id-1]-qty;
            amt=price[id-1]*qty;
            System.out.println("Amount to be Paid : "+amt);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid Book ID or Quantity !!!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Book doesnot Exist;Valid Book ID (1 - 8)");
        }
        catch(ArithmeticException e)
        {
            System.out.println("We do not have that many items!");
        }

    }
}
