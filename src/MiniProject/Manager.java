package MiniProject;
import java.util.*;
public class Manager extends Employee
{
    //Manager(){}
    Manager(String name,int id,double salary,String role)
    {
        super(name,id,salary,role);
    }
    //@Override
    public double calculateBonus()
    {
        bonus=0.3*salary;
        return bonus;
    }
    @Override
    public String getRole()
    {
        return role;
    }
}
