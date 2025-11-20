package MiniProject;
import java.util.*;
public abstract class Employee {
    String name,role;
    int id;
    double salary;
    static double bonus=0.0;
    public abstract double calculateBonus();
    Employee(String name,int id,double salary,String role)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.role=role;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getRole()
    {
        return role;
    }


}