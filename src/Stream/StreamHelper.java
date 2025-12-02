package Stream;
import java.util.*;
import java.util.stream.*;
public class StreamHelper {

    public void filterSalaryAbove20000(List<Employee> emp)
    {
        System.out.println("Filtering the Employees (By Salary > 20000) :");
        emp.stream()
                .filter(s -> s.getSalary() > 20000)
                .toList()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void filterSalaryBelow20000(List<Employee> emp)
    {
        System.out.println("Filtering the Employees (By Salary <= 20000) :");
        emp.stream()
                .filter(s -> s.getSalary() <= 20000)
                .toList()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void filterEmployeeAboveAverageSalary(List<Employee> emp)
    {
        System.out.println("Filtering the Employees (Above Average Salary) :");
        double averageSalary= emp.stream().mapToDouble(Employee::getSalary).sum() /5;
        System.out.println("Average Salary : "+averageSalary);
        emp.stream()
                .filter(s -> s.getSalary() >=averageSalary)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");

    }
    public void filterEmployeeBelowAverageSalary(List<Employee> emp)
    {
        System.out.println("Filtering the Employees (Below Average Salary) :");
        double averageSalary=emp.stream()
                .collect(Collectors.summingDouble(Employee::getSalary))/5;
        System.out.println("Average Salary : "+averageSalary);
        emp.stream()
                .filter(s -> s.getSalary() < averageSalary)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void mappingEmployeestoUppercase(List<Employee> emp)
    {
        System.out.println("Mapping Employees (By Names) :");
        emp.stream()
                .map(n -> n.getName().toUpperCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void sortSalaryByDescendorder(List<Employee> emp)
    {
        System.out.println("Sorting the Employees (By Salary) :");
        emp.stream()
                .distinct()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void groupEmployeesByRole(List<Employee> emp)
    {

        System.out.println("Grouping Employees (By Roles) :");
        Map<String,List<String>> res=emp.stream()
                .collect(Collectors.groupingBy(Employee::getRole,
                        Collectors.mapping(Employee::getName,Collectors.toList())));
        for(Map.Entry<String,List<String>> i:res.entrySet())
            System.out.println(i.getKey()+" : "+i.getValue());
        System.out.println("-------------------------------------------------------");
    }
    public void highpaidEmployee(List<Employee> emp)
    {
        System.out.println("Highest Paid Employee :");
        Optional<Employee> m=emp.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(m.get());
        System.out.println("-------------------------------------------------------");
    }
    public void totalSalaryByAllEmployees(List<Employee> emp)
    {
        System.out.println("Total Salary Expense : ");
        double total=(double) emp.stream()
                .reduce(0,(sum,Employee) -> sum + Employee.getSalary(),Integer::sum);
        System.out.println(total);
        System.out.println("-------------------------------------------------------");
    }
    public void allmatchingEarningAbove10000(List<Employee> emp)
    {
        System.out.println("All Employees earn above 10000 : ");
        boolean f=emp.stream()
                .allMatch(s -> s.getSalary()>=10000);
        System.out.println(f);
        System.out.println("-------------------------------------------------------");
    }
    public void anymatchFoundAbove30000(List<Employee> emp)
    {
        System.out.println("Any Employees earn above 30000 : ");
        boolean f=emp.stream()
                .anyMatch(s -> s.getSalary()>=30000);
        System.out.println(f);
        System.out.println("-------------------------------------------------------");
    }

    public void convertListtoSet(List<Employee> emp)
    {
        System.out.println("Converting the List to Set :");
        Set<Employee> s=emp.stream()
                .collect(Collectors.toSet());
        System.out.println(s);
        System.out.println("-------------------------------------------------------");
    }
    public void streamBuilder()
    {
        System.out.println("Stream to Builder : ");
        Stream.Builder<String> builder= Stream.builder();
        builder.add("Krish");
        Stream<String> e=builder.build();

        e.forEach(System.out::println);
                System.out.println("-------------------------------------------------------");
    }
    public void filterSalaryComesUnderRange(List<Employee> emp)
    {
        System.out.println("Filtering the Employees (Salary range from 10000 to 25000) : ");
        emp.stream()
                .filter(s -> s.getSalary() >=10000 && s.getSalary() <=25000 )
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void displayAllEmployees(List<Employee> emp)
    {
        System.out.println("EMPLOYEES LIST :");
        emp
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void countingOnlyDevelopers(List<Employee> emp)
    {
        System.out.println("No. Of Developers in the Employees List : ");
        int c= (int) emp.stream()
                .filter(s-> s.getRole().equals("Developer"))
                .count();
        System.out.println(c);
        System.out.println("-------------------------------------------------------");
    }
    public void peekAction(List<Employee> emp)
    {
        System.out.println("Peek() Action : ");
        emp.stream()
                .filter(s->s.getName().startsWith("N"))
                .peek(System.out::println)
                .map(n -> n.getSalary()/1000)
                .peek(System.out::println).forEach(n->{});
        System.out.println("-------------------------------------------------------");
    }
    public void mostExperiencedEmployee(List<Employee> emp)
    {
        System.out.println("Most Experienced Employee of the Company : ");
        Optional<Employee> temp=emp.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(temp.isPresent()? temp.get():"LIST IS EMPTY");
        System.out.println("-------------------------------------------------------");
    }
    public void checkValidName(List<Employee> emp)
    {

        System.out.println("Invalid Employee Names (as a Numbers) :");
        emp.stream()
                .filter(s->s.getName().matches("\\d+"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void filterEmployeeExpAbove3Years(List<Employee> emp)
    {
        System.out.println("Employees having Experience Above 3 Years :");
        emp.stream()
                .filter(n -> (2025 - n.getYearOfJoining())>=3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void filterEmployeeExpBelow3Years(List<Employee> emp)
    {
        System.out.println("Employee having Experience Below 3 Years : ");
        emp.stream()
                .filter(n->(2025 - n.getYearOfJoining())<3)
                .toList()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");

    }
    public void findingDistinctEmployees(List<Employee> emp)
    {
        System.out.println("All Distinct Employees (removed duplicates) : ");
        emp.stream()
                .map(Employee::getName)
                .distinct()
                .toList()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void findRecentlyJoinedEmployee(List<Employee> emp)
    {
        System.out.println("Recently Joined Employee : ");
        emp.stream()
                .max(Comparator.comparingInt(Employee::getYearOfJoining))
                .stream()
                .toList()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
    public void groupEmployeeById(List<Employee> emp)
    {
        System.out.println("Grouped Employees By Their ID  : ");
        emp.stream()
                .collect(Collectors.groupingBy(Employee::getId,Collectors.mapping(Employee::getName,Collectors.toList())))
                        .forEach((id,name)->{
                            System.out.print(id + " - ");
                            name.forEach(System.out::println);
                        });
        System.out.println("-------------------------------------------------------");
    }
    public void numberOfEmployeesinEveryRole(List<Employee> emp)
    {
        System.out.println("Employee Roles and its count : ");
        Map<String, Long> temp=emp.stream()
                .collect(Collectors.groupingBy(Employee::getRole,Collectors.counting()));
        System.out.println(temp);
        System.out.println("-------------------------------------------------------");
    }
    public void totalSalaryinEachDept(List<Employee> emp)
    {
        System.out.println("Total Salary in Each Department : ");
        Map<String,Double> temp=emp.stream()
                .collect(Collectors.groupingBy(Employee::getRole,Collectors.summingDouble(Employee::getSalary)));
        System.out.println(temp);
        System.out.println("-------------------------------------------------------");
    }
    public void avgSalaryinEachDept(List<Employee> emp)
    {
        System.out.println("Average Salary in Each Department : ");
        Map<String,Double> temp=emp.stream()
                .collect(Collectors.groupingBy(Employee::getRole,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(temp);
        System.out.println("-------------------------------------------------------");
    }
    public void findingHighestSalaryEmployeeinEachDept(List<Employee> emp)
    {
        System.out.println("Highest Salary Employee in Each Department : ");
        Map<String,Optional<Employee>> temp=emp.stream()
                .collect(Collectors.groupingBy(Employee::getRole,
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        temp.forEach((s,t)->System.out.println(s+" : "+t.map(Employee::getName).get()));
        System.out.println("-------------------------------------------------------");
    }
    public void findingLowestSalaryEmployeeinEachDept(List<Employee> emp)
    {
        System.out.println("Lowest Salary Employee in Each Department : ");
        Map<String,Optional<Employee>> temp=emp.stream()
                .collect(Collectors.groupingBy(Employee::getRole,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        temp.forEach((s,t)->System.out.println(s+" : "+t.map(Employee::getName).get()));
        System.out.println("-------------------------------------------------------");
    }
}
