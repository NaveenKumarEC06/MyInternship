package ShoppingMart;

public class Customer{
    private String name;
    private long mobile;
    private String city;
    Customer(){}
    public Customer(String name, long mobile, String city) {
        this.name=name;
        this.city=city;
        this.mobile=mobile;
    }
    public String getName()
    {
        return name;
    }
    public long getMobile()
    {
        return mobile;
    }
    public String getCity()
    {
        return city;
    }
    public String toString()
    {
        return name+" "+ mobile +" "+city;
    }
}
