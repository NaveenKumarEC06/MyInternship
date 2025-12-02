package ShoppingMart;
import java.util.*;
public class Main extends Bill
{
    public static void main(String args[])
    {
        double bill=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO SHOPPING MART !!!!!");
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        System.out.println("Enter Your Mobile Number : ");
        long mobile=sc.nextLong();
        System.out.println("Enter Your City ");
        String city=sc.next();
        boolean t=true;
        Customer user=new Customer(name,mobile,city);
        Main ob=new Main();
        while(t)
        {
            System.out.println("MAIN MENU");
            System.out.println("ENTER 1 TO FRUITS");
            System.out.println("ENTER 2 TO VEGETABLES");
            System.out.println("ENTER 3 TO SOFT DRINKS");
            System.out.println("ENTER 0 TO EXIT SHOPPING");
            int ch = sc.nextInt();
            switch (ch) {
                case 0:
                    t = false;
                    break;
                case 1:
                    Fruits f = new Fruits();
                    bill = bill+f.getfruits();
                    break;
                case 2:
                    Veg v = new Veg();
                    bill = bill+v.getveg();
                    break;
                case 3:
                    SoftDrink s = new SoftDrink();
                    bill = bill+s.getSoftDrink();
                    break;
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
        System.out.println("Customer Details");
        System.out.println(user);
        System.out.println("Total Amount : "+bill);
            System.out.println("ITEMS IN THE CART : "+ob.list);
            for (Map.Entry<String, Integer> entry : ob.list.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
    }
}
