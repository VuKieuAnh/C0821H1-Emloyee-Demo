package model;

import model.Employee;

public class PartTimeEmployee extends Employee {
    private int hoursWork;

    @Override
    public double getSalary() {
        return hoursWork*100;
    }

    public PartTimeEmployee(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public PartTimeEmployee(String code, String name, String email, int age, String phone, int hoursWork) {
        super(code, name, email, age, phone);
        this.hoursWork = hoursWork;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    @Override
    public String toString() {
        return "model.PartTimeEmployee{" +
                "hoursWork=" + hoursWork +
                '}';
    }
}
