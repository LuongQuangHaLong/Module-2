package Bai15;

public interface IStudentinterface {
    void showAll();

    void addStudent();

    void updateStudent();

    void removeStudent();

    Student findStudentById(int var1);

    double getAverageScore();

    void sortByScore();
}
