package ShoppingMart;
import java.util.*;
import java.io.*;

public class SoftDrink extends Bill{
    double getSoftDrink()
    {
        SoftDrink ob=new SoftDrink();
        boolean t=true;
        double bill=0.0;
        Scanner sc=new Scanner(System.in);
        String[] items={"REDBULL","MOUNTAIN DEW","COKE"};
        while(t)
        {
            System.out.println("ID No.1 : REDBULL - 120.0 (750 mL)");
            System.out.println("ID No.2 : MOUNTAIN DEW - 80.0 (1L)");
            System.out.println("ID No.3 : COKE - 60.0 (1L)");
            System.out.println("ENTER ID TO BUY : ");
            int id=sc.nextInt();
            System.out.println("ENTER NO.OF QTY : ");
            int qty=sc.nextInt();
            switch(id)
            {
                case 1:
                    bill=bill+ob.calculate(210,qty);
                    ob.list.put(items[id-1],qty);
                    break;
                case 2:
                    bill=bill+ob.calculate(180,qty);
                    ob.list.put(items[id-1],qty);
                    break;
                case 3:
                    bill=bill+ob.calculate(150,qty);
                    ob.list.put(items[id-1],qty);
                    break;
                default:System.out.println("Wrong Choice!!");
            }
            System.out.println("ITEMS ADDED TO THE CART !");
            System.out.println("ENTER 1 TO CONTINUE SHOPPING , 0 TO QUIT");
            int n=sc.nextInt();
            if(n==0)
            {  t=false;}
        }
        return bill;
    }
}
