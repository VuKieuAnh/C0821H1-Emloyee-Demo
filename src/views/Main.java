package views;

import controller.EmployeeManager;
import controller.EmployeeManagerArrayList;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagerArrayList kieuAnh = new EmployeeManagerArrayList();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, 1000, 10000));
        employees.add(new FullTimeEmployee(2, 500, 10000));
        employees.add(new FullTimeEmployee(3, 12000, 10000));
        employees.get(0).setAge(28);
        employees.get(1).setAge(30);
        employees.get(2).setAge(15);
        kieuAnh.setEmployeeArrayList(employees);

        kieuAnh.showAllEmployee();
        kieuAnh.sortById();
        kieuAnh.showAllEmployee();
//        EmployeeManager kieuAnh = new EmployeeManager();
//        EmployeeManager quan = new EmployeeManager();
//        Employee[] c08h1 = new Employee[3];
//        c08h1[0] = new FullTimeEmployee(1, 1000, 10000);
//        c08h1[1] = new FullTimeEmployee(2, 1000, 10000);
//        c08h1[2] = new FullTimeEmployee(3, 1000, 10000);
//        kieuAnh.setEmployeeList(c08h1);
//        quan.setEmployeeList(c08h1);
//        kieuAnh.showAllEmployee();
//        kieuAnh.getEmployeeLower();
//
//        int index = inputId();
//        Employee employee = createNewEmployee();
//        kieuAnh.updateByIndex(index, employee);
//        kieuAnh.showAllEmployee();


//        //cho ng dung nhap vao du lieu
//        //tao moi nhan vien
//        model.Employee newEmployee = createNewEmployee();
//        // goi phuong thuc o manager
//        kieuAnh.addNewEmployee(newEmployee);
//        quan.addNewEmployee(newEmployee);
//        kieuAnh.showAllEmployee();

//        int index = inputId();
//        kieuAnh.deleteByIndex(index);
//        kieuAnh.showAllEmployee();


    }
    public static Employee createNewEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so gio lam viec");
        int hours = scanner.nextInt();
        Employee newE = new PartTimeEmployee(hours);
        return newE;
    }
    public static int inputId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao index");
        int index = scanner.nextInt();
        return index;
    }
}
