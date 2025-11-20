package MiniProject;
import java.util.*;
public class Intern extends Employee
{
    //Intern(){}
    Intern(String name,int id,double salary,String role)
    {
        super(name,id,salary,role);
    }
    //@Override
    public double calculateBonus()
    {
        bonus=salary*0.15;
        return bonus;
    }
    @Override
    public String getRole()
    {
        return role;
    }
}
