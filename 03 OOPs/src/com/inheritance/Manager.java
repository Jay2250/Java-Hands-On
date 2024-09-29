package com.inheritance;

public class Manager extends SalariedEmployee {
    protected double allowances;
    public Manager(int empid, String name, double basic, double allowances) {
        super(empid, name, basic);
        this.allowances=allowances;
    }

    @Override
    public double calculateGross() {
        double total= super.calculateGross();
        return total+total*(allowances/100);
    }

    public double getAllownces(){
        return allowances;
    }
}
