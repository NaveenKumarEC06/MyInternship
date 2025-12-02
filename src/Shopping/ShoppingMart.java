package Shopping;

import java.util.*;

public class ShoppingMart
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        List<Product> list=Arrays.asList(
                new Product(1,"Item 1",200.0),
                new Product(2,"Item 2",300.0),
                new Product(3,"Item 3",800.0));
        System.out.println(list);
        Cart cart=new Cart();
        cart.addProductToCart(list,1);
        cart.viewCart();
        cart.removeProductfromCart(list,1);
        cart.viewCart();
        cart.addProductToCart(list,1);
        cart.addProductToCart(list,2);
        cart.addProductToCart(list,3);
        cart.viewCart();
        cart.removeAllProductsinCart();
        cart.addProductToCart(list,3);
        cart.addProductToCart(list,2);
        cart.viewCart();
        Payroll pay=new Payroll();
        pay.checkOutToPay(cart.getCart());
        pay.discount(cart.getCart(),25.0);
    }
}
