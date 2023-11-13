package Bai15;

import Bai15.IStudentinterface;
import Bai15.Student;

import java.util.*;

public class StudentService implements IStudentinterface {
    Scanner sc;
    List<Student> students;

    public StudentService() {
        this.sc = new Scanner(System.in);
        this.students = new ArrayList();
    }

    public void showAll() {
        Iterator var1 = this.students.iterator();

        while (var1.hasNext()) {
            Student student = (Student) var1.next();
            System.out.println(student);
        }

    }

    public void addStudent() {
        Student student = new Student();
        System.out.println("---Thêm mới sinh viên---");
        System.out.print("Hãy nhập ID sinh viên : ");
        student.setStudentID(Integer.parseInt(this.sc.nextLine()));
        System.out.print("Hãy nhập tên sinh viên : ");
        student.setName(this.sc.nextLine());
        System.out.print("Hãy nhập điểm trung bình của sinh viên : ");
        student.setAverageSore(Double.parseDouble(this.sc.nextLine()));
        this.students.add(student);
    }

    public void updateStudent() {
        System.out.println("---Sửa sinh viên---");
        System.out.print("Hãy nhập ID của sinh viên cần sửa : ");
        int editId = Integer.parseInt(this.sc.nextLine());
        Student student = this.findStudentById(editId);
        System.out.print("Hãy nhập tên sinh viên : ");
        student.setName(this.sc.nextLine());
        System.out.print("Hãy nhập điểm sinh viên : ");
        student.setAverageSore(Double.parseDouble(this.sc.nextLine()));
        this.students.set(this.students.indexOf(this.findStudentById(editId)), student);
        System.out.println("-----Sửa thành công-----");
    }

    public void removeStudent() {
        System.out.println("---Xóa sinh viên---");
        System.out.print("Hãy nhập ID của sinh viên cần xóa : ");
        int delId = Integer.parseInt(this.sc.nextLine());
        this.students.remove(this.findStudentById(delId));
        System.out.println("-----Xóa thành công-----");
    }

    public Student findStudentById(int id) {
        Iterator var2 = this.students.iterator();

        Student student;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            student = (Student) var2.next();
        } while (student.getStudentID() != id);

        return student;
    }

    public double getAverageScore() {
        double total = 0.0;

        Student student;
        for (Iterator var3 = this.students.iterator(); var3.hasNext(); total += student.getAverageSore()) {
            student = (Student) var3.next();
        }

        return total / (double) this.students.size();
    }

    public void sortByScore() {
        Collections.sort(this.students);
        Iterator var1 = this.students.iterator();

        while (var1.hasNext()) {
            Student student = (Student) var1.next();
            System.out.println(student);
        }

    }

}
