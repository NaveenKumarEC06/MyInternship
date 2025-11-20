package MiniProject;
import java.util.*;
public class Developer extends Employee
{
    //Developer(){}
    Developer(String name,int id,double salary,String role)
    {
        super(name,id,salary,role);
    }
    //@Override
    public double calculateBonus()
    {
        bonus=salary*0.25;
        return bonus;
    }
    @Override
    public String getRole()
    {
        return role;
    }
}
