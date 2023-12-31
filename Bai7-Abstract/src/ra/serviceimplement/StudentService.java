package ra.serviceimplement;

import ra.model.Student;
import ra.service.IStudentService;

public class StudentService implements IStudentService {
    private Student[] students = new Student[100];
    private int count = 0;
    @Override
    public int getSize() {
        return count;

    }
    @Override
    public Student[] findAll() {
        return students;
    }
    @Override
    public void create(Student student) {
        if (count<students.length){
            students[count] = student; // chen phan tu vao cuoi mang
            count++;
        }
    }
    @Override
    public void update(Student student) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId()==student.getId()){
                students[i] = student;
                break;
            }
        }
    }
    @Override
    public void delete(int id) {
        int indexDelete = indexOfStudents(id);
        if (indexDelete !=-1){
        for (int i = indexDelete; i < count-1 ; i++) {
            students[i]=students[i+1];
        }
        students[count-1]=null;
        count--;
        }
    }
    @Override
    public int indexOfStudents(int id) {
        for (int i = 0; i < count ; i++) {
            if (students[i].getId()==id){
                return i;
            }
        }
        return -1;
    }
}
