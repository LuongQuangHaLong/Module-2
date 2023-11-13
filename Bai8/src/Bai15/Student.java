package Bai15;

public class Student implements Comparable<Student> {
    private int studentID;
    private String name;
    private double averageSore;

    public int compareTo(Student o) {
        if (this.averageSore > o.averageSore) {
            return 1;
        } else {
            return this.averageSore == o.averageSore ? 0 : -1;
        }
    }

    public Student() {
    }

    public Student(int studentID, String name, double averageSore) {
        this.studentID = studentID;
        this.name = name;
        this.averageSore = averageSore;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageSore() {
        return this.averageSore;
    }

    public void setAverageSore(double averageSore) {
        this.averageSore = averageSore;
    }

    public String toString() {
        return "[studentID=" + this.studentID + ", name='" + this.name + '\'' + ", averageSore=" + this.averageSore + ']';
    }
}