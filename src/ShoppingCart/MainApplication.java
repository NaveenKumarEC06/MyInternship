package ShoppingCart;

import java.util.*;
import java.io.*;

record Customer(String name,long mobile,String city)
{
    @Override
    public String toString() {
        return name +"\t"+ mobile +"\t"+ city ;
    }
}
public class MainApplication
{
    public HashMap<HashMap<String,Double>,Integer> cart=new HashMap<HashMap<String,Double>,Integer>();
    public double total_amount=0.0;
    public void Main()
    {
        MainApplication ob=new MainApplication();
        double bill=0.0;
        int choice;
        boolean t=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER COSTUMER NAME  :");
        String name=sc.next();
        System.out.println("ENTER YOUR MOBILE NO. :");
        long mobile=sc.nextLong();
        System.out.println("ENTER YOUR CITY :");
        String city=sc.next();
        Customer c=new Customer(name,mobile,city);
        while(t)
        {
            System.out.println("MAIN MENU");
            System.out.println("ENTER 1 TO BUY GROCERY");
            System.out.println("ENTER 2 TO BUY ELECTRONICS");
            System.out.println("ENTER 3 TO BUT FASHION APPAREL");
            System.out.println("ENTER 0 TO EXIT SHOPPING");
            choice =sc.nextInt();
            switch(choice)
            {
                case 0:
                        t=false;
                        break;
                case 1: Grocery g=new Grocery();
                        total_amount=total_amount+g.Choice();
                        break;
                /*case 2: e.Choice();
                        break;
                case 3:f.Choice();
                break;*/
                default:System.out.println("WRONG CHOICE !! ENTER VALID CHOICE : ");
                break;
            }
        }
        System.out.println("CUSTOMER DETAILS : ");
        System.out.println("NAME\tMOBILE NO.\tCITY");
        System.out.println(c);
        System.out.println("CART DETAILS");
        System.out.println("ITEM NAME\t\tPRICE\tQTY");
        System.out.println(ob.cart);
        System.out.println("AMOUNT : "+total_amount);
    }
}
