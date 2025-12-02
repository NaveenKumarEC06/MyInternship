package Shopping;
import java.util.*;
import java.util.stream.*;
public class Payroll {
    public void checkOutToPay(List<Product> cartlist)
    {
        double total= cartlist.stream().mapToDouble(Product::getPrice).sum();
        Logger.print("TOTAL AMT : "+total);
    }
    public void discount(List<Product> cartlist,double p)
    {
        double total= cartlist.stream().mapToDouble(Product::getPrice).sum();
        double amt=total-(total*p/100);
        Logger.print("AMT TO BE PAID : "+amt);
    }
}
