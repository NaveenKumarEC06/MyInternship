package Stream;
import java.util.*;

public class Employee {
    int id;
    String name;
    String role;
    int salary;
    int year;
    Employee()
    {

    }
    Employee(int id,String name,String role,int salary,int year)
    {
        this.id=id;
        this.name=name;
        this.role=role;
        this.salary=salary;
        this.year=year;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getRole()
    {
        return role;
    }
    public int getSalary()
    {
        return salary;
    }
    public int getYearOfJoining()
    {
        return year;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+role+" "+salary+" "+year;
    }
}
