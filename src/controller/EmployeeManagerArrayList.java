package controller;


import model.Employee;
import model.FullTimeEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManagerArrayList {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    //them moi nhan vien
    //khong co du lieu tra ve
    //1 tham so truyen vao
    public void addNewEmployee(Employee newEmployee){
        employeeArrayList.add(newEmployee);
//        Employee[] newEmployeeList = new Employee[employeeList.length + 1];
//        for (int i = 0; i < employeeList.length; i++) {
//            newEmployeeList[i] = employeeList[i];
//        }
//        newEmployeeList[employeeList.length] = newEmployee;
//        employeeList = newEmployeeList;
    }

    public void deleteByIndex(int index){
        employeeArrayList.remove(index);
//        Employee[] newEmployeeList = new Employee[employeeList.length -1];
//        for (int i = 0; i < index; i++) {
//            newEmployeeList[i] = employeeList[i];
//        }
//        for (int i = index; i < employeeList.length-1; i++) {
//            newEmployeeList[i] = employeeList[i+1];
//        }
//        employeeList = newEmployeeList;
    }
//
    public void updateByIndex(int index, Employee employee){
        employeeArrayList.set(index, employee);
//        employeeList[index] = employee;
    }
//
//    //tinh luong trung binh
    public double getAverage(){
        double sum = 0;
        for (Employee e:
                employeeArrayList) {
            sum+=e.getSalary();
        }
        double average= sum/employeeArrayList.size();
        return  average;
    }
//
//    //Viết phương thức liệt kê danh sách nhân viên toàn thời gian
//    // có mức lương thấp hơn
//    // mức lương trung bình của các nhân viên trong công ty.
    public ArrayList<Employee> getEmployeeLower(){
        //Đếm xem có bao nhiêu ng có luong thấp hơn
        double average= getAverage();
        ArrayList<Employee> employeeList =  new ArrayList<>();
//        int count = 0;
        for (Employee e: employeeArrayList
        ) {
            if (e instanceof FullTimeEmployee && e.getSalary() <average)
                employeeList.add(e);
        }
//        // tạo mảng và add ng vào
//        Employee[] newEL = new Employee[count];
//        int i = 0;
//
//        for (Employee e: employeeList
//        ) {
//            if (e instanceof FullTimeEmployee && e.getSalary() <getAverage()){
//                newEL[i] = e;
//                i++;
//                System.out.println(e);
//            }
//
//        }

        return employeeList;
    }
//
    public void showAllEmployee(){
        for (Employee e: employeeArrayList
        ) {
            System.out.println(e);
        }
    }

    //c1: su dung interface comparator
    public void sortBySalary(){
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()<o2.getSalary()?1:-1;
            }
        };
        employeeArrayList.sort(employeeComparator);
    }

//    c2: sử dụng interface comparable
    public void sortById(){
        Collections.sort(employeeArrayList);
    }
}
