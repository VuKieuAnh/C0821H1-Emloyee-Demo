package model;

public abstract class Employee {
    private String code;
    private String name;
    private String email;
    private int age;
    private String phone;

    public Employee() {
    }

    public Employee(String code, String name, String email, int age, String phone) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "model.Employee{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
