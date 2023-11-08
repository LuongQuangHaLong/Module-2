package BaiTap6;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    // Constructor không tham số
    public Employee() {
    }

    // Constructor có tham số
    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.calSalary();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Phương thức cho phép người dùng nhập thông tin nhân viên
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        System.out.print("Nhập giới tính: ");
        this.gen = scanner.nextLine();

        System.out.print("Nhập hệ số lương: ");
        this.rate = scanner.nextDouble();

        this.calSalary(); // Tính lại lương sau khi nhập thông tin mới
    }

    // Phương thức tính lương
    public void calSalary() {
        this.salary = this.rate * 1300000; // Tính lương theo công thức
    }

    // Phương thức hiển thị thông tin nhân viên
    public void displayData() {
        System.out.println("Mã nhân viên: " + this.employeeId);
        System.out.println("Tên nhân viên: " + this.employeeName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gen);
        System.out.println("Hệ số lương: " + this.rate);
        System.out.println("Lương: " + this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gen='" + gen + '\'' +
                ", rate=" + rate +
                ", salary=" + rate*1300000 +
                '}';
    }
}
