package ra.service;

import ra.model.Student;

public interface IStudentService {
    // Định nghĩa 4 phương thức trừu tượng CRUD;
    Student[] findAll();
    void create(Student student);
    void update(Student student);
    void delete(int id);
    int getSize(); // tra ve so luong phan tu khac null
    int indexOfStudents(int id);

}
