package ShoppingMart;
import java.util.*;
import java.io.*;
public class Bill {
    Map<String,Integer> list=new HashMap<>();
    public double calculate(double p,int qty)
    {
        return p*qty;
    }

}
