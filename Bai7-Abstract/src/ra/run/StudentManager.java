package ra.run;

import ra.model.Student;
import ra.serviceimplement.StudentService;

import java.util.Scanner;

public class StudentManager {
    private static StudentService studentService = new StudentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Hiển thị danh sách sinh viên ");
            System.out.println("2. Thêm sinh viên ");
            System.out.println("3. Cập nhật ");
            System.out.println("4. Xóa ");
            System.out.println("5. Thoát ");
            System.out.println("Nhập lựa chọn của bạn: ");
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1: // Hien Thi
                    int count = studentService.getSize();
                    Student[] students = studentService.findAll();
                    if (studentService.getSize() == 0) {
                        System.out.println("Chưa có sinh viên!!!");
                    } else {
                        for (int i = 0; i < studentService.getSize(); i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 2: // Them moi
                    System.out.println("Nhập thông tin mới");
                    System.out.println("Nhập ID: ");
                    int newId;
                    while (true) {
                        newId = scanner.nextInt();
                        if (studentService.indexOfStudents(newId) == -1) {
                            break;
                        }
                        System.out.println("ID đã tồn tại. Nhập lại!!!");
                    }
                    scanner.nextLine();
                    System.out.println("Nhập tên: ");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Giới tính: ");
                    boolean newSex = Boolean.parseBoolean(scanner.nextLine());
                    Student s = new Student(newId, newName, newAge, newSex);
                    studentService.create(s);
                    System.out.println("Thêm mới thành công!!!");
                    break;
                case 3: // Chinh sua
                    System.out.println("Nhập ID cần sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    if(studentService.indexOfStudents(editId)==-1){
                        System.err.println("Không tồn tại ID!!!");
                    } else {
                        // tien hanh sua thong tin
                        System.out.println("Nhập tên: ");
                        String updateName = scanner.nextLine();
                        System.out.println("Nhập tuổi: ");
                        int updateAge = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Giới tính: ");
                        boolean updateSex = Boolean.parseBoolean(scanner.nextLine());
                        Student studentUpdate = new Student(editId,updateName,updateAge,updateSex);
                        studentService.update(studentUpdate);
                        System.out.println("Chỉnh sửa thành công!!!");
                    }
                    break;
                case 4: // Xoa
                    System.out.println("Nhập ID cần sửa: ");
                    int deleteId = scanner.nextInt();
                    if(studentService.indexOfStudents(deleteId)==-1){
                        System.err.println("Không tồn tại ID!!!");
                    } else {
                        studentService.delete(deleteId);
                        System.out.println("Xóa thành công!!!");
                    }
                    break;
                case 5: // Thoat
                    System.exit(0);
                    break;
            }
        }
    }
}
