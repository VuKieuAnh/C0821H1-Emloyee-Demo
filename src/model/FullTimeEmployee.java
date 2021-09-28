package model;

import model.Employee;

public class FullTimeEmployee extends Employee {
    private int bonus;
    private int fine;
    private int hardSalary;

    @Override
    public double getSalary() {
        return hardSalary + (bonus - fine);
    }

    public FullTimeEmployee(int bonous, int fine, int hardSalary) {
        this.bonus = bonous;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public FullTimeEmployee(String code, String name, String email, int age, String phone, int bonous, int fine, int hardSalary) {
        super(code, name, email, age, phone);
        this.bonus = bonous;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "model.FullTimeEmployee{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", hardSalary=" + hardSalary +
                '}';
    }
}
