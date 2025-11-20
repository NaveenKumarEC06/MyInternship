package Stream;
import java.util.*;

public class EmployeeOperations {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Employee> emp;
        emp = Arrays.asList(
                new Employee(1,"Naveen","Intern",12000,2024),
                new Employee(2,"Sugumar","Tester",14000,2020),
                new Employee(3,"Ramesh","Developer",24000,2018),
                new Employee(4,"Jithesh","Sales Executive",30000,2015),
                new Employee(5,"Sam","Manager",90000,2012),
                new Employee(1,"Naveen","Developer",45000,2021),
                new Employee(1,"Naveen","Manager",67000,2019),
                new Employee(4,"4567","Manager",80000,2025)

        );
        StreamHelper ob=new StreamHelper();
        ob.displayAllEmployees(emp);
        ob.filterSalaryAbove20000(emp);
        ob.filterSalaryBelow20000(emp);
        ob.filterSalaryComesUnderRange(emp);
        ob.anymatchFoundAbove30000(emp);
        ob.countingOnlyDevelopers(emp);
        ob.filterEmployeeAboveAverageSalary(emp);
        ob.filterEmployeeBelowAverageSalary(emp);
        ob.mappingEmployeestoUppercase(emp);
        ob.sortSalaryByDescendorder(emp);
        ob.groupEmployeesByRole(emp);
        ob.highpaidEmployee(emp);
        ob.totalSalaryByAllEmployees(emp);
        ob.allmatchingEarningAbove10000(emp);
        ob.convertListtoSet(emp);
        ob.streamBuilder();
        ob.peekAction(emp);
        ob.mostExperiencedEmployee(emp);
        ob.checkValidName(emp);
        ob.filterEmployeeExpAbove3Years(emp);
        ob.filterEmployeeExpBelow3Years(emp);
        ob.findingDistinctEmployees(emp);
        ob.findRecentlyJoinedEmployee(emp);
        ob.groupEmployeeById(emp);
        ob.numberOfEmployeesinEveryRole(emp);
        ob.totalSalaryinEachDept(emp);
        ob.avgSalaryinEachDept(emp);
        ob.findingHighestSalaryEmployeeinEachDept(emp);
        ob.findingLowestSalaryEmployeeinEachDept(emp);
    }
}
