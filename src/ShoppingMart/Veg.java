package ShoppingMart;

import java.util.Scanner;

public class Veg extends Bill{
    double getveg()
    {
        Veg ob=new Veg();
        boolean t=true;
        double bill=0.0;
        Scanner sc=new Scanner(System.in);
        String[] items={"CARROT","SPINACH","BEANS"};
        while(t)
        {
            System.out.println("ID No.1 : CARROT - 90.0 (per Kg)");
            System.out.println("ID No.2 : SPINACH - 75.0 (per Kg)");
            System.out.println("ID No.3 : BEANS - 80.0 (per Kg)");
            System.out.println("ENTER ID TO BUY : ");
            int id=sc.nextInt();
            System.out.println("ENTER NO.OF QTY : ");
            int qty=sc.nextInt();
            switch(id)
            {
                case 1:
                    bill=bill+ob.calculate(90,qty);
                    ob.list.put(items[id-1],qty);
                    break;
                case 2:
                    bill=bill+ob.calculate(75,qty);
                    ob.list.put(items[id-1],qty);
                    break;
                case 3:
                    bill=bill+ob.calculate(80,qty);
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

