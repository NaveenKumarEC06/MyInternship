package MiniProject;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Main m=new Main();
        List<Employee>emp=new ArrayList<>();
        emp.add(new Intern("Naveen",2,1000,"Intern"));
        emp.add(new Developer("Kalam",45,9000,"Developer"));
        emp.add(new Manager("Deva",78,10000,"Manager"));
        emp.add(new Developer("Rishi",43,23000,"Developer"));
        for(Employee ob:emp) {
            System.out.println("--------------Employee Details------------");
            System.out.println("NAME\t|\tID\t|\tSALARY\t|\tDEFAULT BONUS\t|\tRole\t|");
            System.out.println(ob.getName() + "\t|\t" + ob.getId() + "\t|\t" + ob.getSalary() +"\t|\t" + ob.calculateBonus() + "\t|\t" + ob.getRole());
        }
    }
}
