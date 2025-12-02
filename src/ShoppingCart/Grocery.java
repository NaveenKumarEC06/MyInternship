package ShoppingCart;

import java.util.*;
import java.io.*;
public class Grocery extends MainApplication
{
    HashMap<HashMap<String,Double>,Integer> s=new HashMap<HashMap<String,Double>,Integer>();
    private double fruits()
    {
        Scanner sc = new Scanner(System.in);
        String[] items = {"APPLE", "ORANGE", "MANGO"};
        double[] price = {210.0, 170.0, 120.0};
        boolean t = true;
        int id;
        int qty;
        HashMap<String, Double> list = new HashMap<>();
        double amount = 0.0;
        while (t) {
            System.out.println("ID No.1 : APPLE - 210.0 (per Kg)");
            System.out.println("ID No.2 : ORANGE - 170.0 (per Kg)");
            System.out.println("ID No.3 : MANGO - 120.0 (per Kg)");
            System.out.println("ENTER 0 TO EXIT FRUITS SECTION");
            System.out.println("ENTER ID TO BUY : ");
            id = sc.nextInt();
            if (id == 0) {
                t = false;
                break;
            } else if (id >= 1 && id <= 3) {
                System.out.println("ENTER QTY : ");
                qty = sc.nextInt();
                amount = amount + (price[id - 1] * qty);
                MainApplication ob = new MainApplication();
                list.put(items[id - 1], price[id - 1]);
                s.put(list, qty);
                ob.cart = s;
                System.out.println("AMOUNT : "+amount);
                System.out.println(items[id - 1] + " QTY : " + qty + " ADDED TO CART SUCCESSFULLY ");
            } else {
                System.out.println("WRONG CHOICE !! ENTER VALID CHOICE : ");
            }
        }
        return amount;
    }
    public double Choice()
    {
       // Grocery groc = new Grocery();
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean status = true;
        double bill=0.0;
        while (status)
        {
            System.out.println("WELCOME TO GROCERY SECTION !!!");
            System.out.println("ENTER 1 TO BUY FRUITS");
            System.out.println("ENTER 2 TO BUY VEGETABLES");
            System.out.println("ENTER 3 TO BUY DAIRY PRODUCTS");
            System.out.println("ENTER 4 TO BUY MEAT & SEA FOODS");
            System.out.println("ENTER 0 TO EXIT GROCERY SECTION");
            System.out.println("ENTER THE CHOICE : ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    status = false;
                    break;
                case 1:
                    bill=bill+fruits();
                    break;
                /*case 2:
                    vegetables();
                    break;
                case 3:
                    dairyProducts();
                    break;
                case 4:
                    meat();
                    break;*/
                default:
                    System.out.println("WRONG CHOICE !! ENTER THE VALID CHOICE : ");
                    break;
            }

        }
        return bill;

    }
}
