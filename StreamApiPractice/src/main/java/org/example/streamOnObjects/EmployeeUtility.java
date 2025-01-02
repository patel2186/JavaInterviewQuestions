package org.example.streamOnObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtility {
    List<Employee> employeeList = new ArrayList<>();
    public EmployeeUtility(){

        employeeList.add(new Employee(Long.valueOf(1),"mahesh",new Address("mumbai","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(2),"akash",new Address("mumbai","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(3),"mayank",new Address("mumbai","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(4),"sudheer",new Address("pune","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(5),"kunal",new Address("pune","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(6),"rohit",new Address("mumbai","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(7),"darshan",new Address("bangalore","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(8),"sai",new Address("mumbai","maharashtra")));
        employeeList.add(new Employee(Long.valueOf(9),"pavan",new Address("pune","maharashtra")));

    }
    public void getCityEmployeeCount() {
        Map<String,Long> employeeByCity = employeeList.stream()
                .collect(Collectors.groupingBy(emp->emp.getAddress().getCity(),Collectors.counting()));

        System.out.println(employeeByCity);
    }

    public void sortedEmployees() {
        //sorts employee by city and then by name using default sorting
        System.out.println(employeeList.stream().sorted().collect(Collectors.toList()));
    }

}
