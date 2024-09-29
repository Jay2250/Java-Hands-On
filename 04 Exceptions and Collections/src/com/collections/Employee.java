package com.collections;

import java.util.Set;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String name;
    private double salary;
    private Set<String> skillsets;

    public Employee(int empid, String name, double salary, Set<String> skillsets) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.skillsets = skillsets;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkillsets() {
        return skillsets;
    }

    public void setSkillsets(Set<String> skillsets) {
        this.skillsets = skillsets;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillsets=" + skillsets +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.empid - o.empid; // ascending
//        if (this.empid <= o.empid)
//            return -1;
//        else
//            return 1;
    }
}
