package controller;

import model.Employee;
import model.FullTimeEmployee;

public class EmployeeManager {
    private Employee[] employeeList={};

    public Employee[] getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Employee[] employeeList) {
        this.employeeList = employeeList;
    }

    //them moi nhan vien
    //khong co du lieu tra ve
    //1 tham so truyen vao
    public void addNewEmployee(Employee newEmployee){
        Employee[] newEmployeeList = new Employee[employeeList.length + 1];
        for (int i = 0; i < employeeList.length; i++) {
            newEmployeeList[i] = employeeList[i];
        }
        newEmployeeList[employeeList.length] = newEmployee;
        employeeList = newEmployeeList;
    }

    public void deleteByIndex(int index){
        Employee[] newEmployeeList = new Employee[employeeList.length -1];
        for (int i = 0; i < index; i++) {
            newEmployeeList[i] = employeeList[i];
        }
        for (int i = index; i < employeeList.length-1; i++) {
            newEmployeeList[i] = employeeList[i+1];
        }
        employeeList = newEmployeeList;
    }

    public void updateByIndex(int index, Employee employee){
        employeeList[index] = employee;
    }

    //tinh luong trung binh
    public double getAverage(){
        double sum = 0;
        for (Employee e:
             employeeList) {
            sum+=e.getSalary();
        }
        double average= sum/employeeList.length;
        return  average;
    }

    //Viết phương thức liệt kê danh sách nhân viên toàn thời gian
    // có mức lương thấp hơn
    // mức lương trung bình của các nhân viên trong công ty.
    public Employee[] getEmployeeLower(){
        //Đếm xem có bao nhiêu ng có luong thấp hơn
        double average= getAverage();
        int count = 0;
        for (Employee e: employeeList
             ) {
            if (e instanceof FullTimeEmployee && e.getSalary() <average)
                count++;
        }
        // tạo mảng và add ng vào
        Employee[] newEL = new Employee[count];
        int i = 0;

        for (Employee e: employeeList
        ) {
            if (e instanceof FullTimeEmployee && e.getSalary() <getAverage()){
                newEL[i] = e;
                i++;
                System.out.println(e);
            }

        }

        return newEL;
    }

    public void showAllEmployee(){
        for (Employee e: employeeList
             ) {
            System.out.println(e);
        }
    }
}
