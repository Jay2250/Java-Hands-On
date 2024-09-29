package com.inheritance;

public class ContractEmployee extends Employee {
    protected double remuneration;
    protected int hours;
    public ContractEmployee(int empid, String name, double remuneration, int hours)
    {
        super(empid, name);
        this.remuneration =remuneration;
        this.hours=hours;
    }

    @Override
    public double calculateGross() {
        return remuneration *(double)hours;
    }
}
