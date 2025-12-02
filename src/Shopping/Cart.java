package Shopping;
import java.util.*;
import java.util.stream.*;
public class Cart
{
    List<Product> cart = new ArrayList<>();
    public void addProductToCart(List<Product>list, int id)
    {
        Product p=list.get(id-1);
        cart.add(p);
        Logger.print("ITEM ADDED TO THE CART SUCCESSFULLY !!");
    }
    public void viewCart()
    {
        Logger.print("CART DETAILS :");
        for(Product product:cart)
        {
            Logger.print(product.getId()+"\t"+product.getName()+"\t"+product.getPrice());
        }
    }
    public void removeProductfromCart(List<Product> list, int productId)
    {

        Product t=list.get(productId);
        cart.remove(productId-1);
    }
    public void removeAllProductsinCart()
    {
        cart.clear();
    }
    public List<Product> getCart()
    {
        return cart;
    }
}
