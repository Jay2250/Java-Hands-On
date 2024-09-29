package com.collections;

import java.util.*;

public class EmployeeCollections {
    public List<Employee> initializeEmployeeData() {
        List emplist = new ArrayList<>();
        Set<String> skills = new TreeSet<>();
        skills.add("Java");
        skills.add("C++");
        emplist.add(new Employee(101, "Jay", 50000, skills));
        skills = new TreeSet<>();
        skills.add("Java");
        skills.add("C");
        emplist.add(new Employee(201, "Abhi", 40000, skills));
        skills = new TreeSet<>();
        skills.add("Python");
        skills.add("C");
        emplist.add(new Employee(301, "Sammak", 30000, skills));
        skills = new TreeSet<>();
        skills.add("Java");
        skills.add("Python");
        emplist.add(new Employee(401, "Harish", 45000, skills));

        return emplist;
    }

    public void printList(List<Employee> emplist) {
        for (Employee e : emplist) {
            System.out.println(e);
        }
    }

    public Employee searchEmployee(List<Employee> emplist, int empid) {
        for (Employee emp : emplist) {
            if (emp.getEmpid() == empid)
                return emp;
        }
        return null;
    }

    public List<Employee> filterEmployees(List<Employee> employees, String criteria) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getSkillsets().contains(criteria))
                filteredList.add(emp);
        }
        return filteredList;
    }

    public Map<Integer, Double> salaryMap(List<Employee> employees) {
        Map<Integer, Double> salarymap = new TreeMap<>();
        for (Employee emp : employees) {
            salarymap.put(emp.getEmpid(), emp.getSalary());
        }
        return salarymap;
    }

    public static void main(String[] args) {
        EmployeeCollections employeeCollections = new EmployeeCollections();
        List<Employee> employees = employeeCollections.initializeEmployeeData();

        employeeCollections.printList(employees);

        System.out.println("---------------------------------------------------");
        System.out.println(employeeCollections.searchEmployee(employees, 401));

        System.out.println("---------------------------------------------------");
        System.out.println("Employees having Skills as Java are : ");
        List<Employee> employeeList = employeeCollections.filterEmployees(employees, "Java");
        employeeCollections.printList(employees);

        System.out.println("---------------------------------------------------");
        System.out.println("Employees Salary Mapping : ");
        Map<Integer, Double> salaryMap = employeeCollections.salaryMap(employees);
        for(Map.Entry<Integer, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        System.out.println("---------------------------------------------------");
        System.out.println("--------------Sort by Employee Id------------------");
        Collections.sort(employees);
        employeeCollections.printList(employees);
        int index = Collections.binarySearch(employees, new Employee(101, null, 0, null));
        System.out.println("Found at Index : " + index);

        System.out.println("--------------Sort by Employee Name----------------");
        Collections.sort(employees, new NameComparator());
        employeeCollections.printList(employees);
        index = Collections.binarySearch(employees, new Employee(0, "Abhi", 0, null));
        System.out.println("Found at Index : " + index);

        System.out.println("--------------Sort by Employee Salary--------------");
        Collections.sort(employees, new SalaryComparator());
        employeeCollections.printList(employees);
        index = Collections.binarySearch(employees, new Employee(0, null, 45000.0, null));
        System.out.println("Found at Index : " + index);

        System.out.println("---------------------------------------------------");
        System.out.println("Minimum Salary : ");
        System.out.println(Collections.min(employees, new SalaryComparator()));
        System.out.println("Maximum Salary : ");
        System.out.println(Collections.max(employees, new SalaryComparator()));
        System.out.println("Reverse List based on Salary : ");
        Collections.reverse(employees);
        employeeCollections.printList(employees);
    }
}
