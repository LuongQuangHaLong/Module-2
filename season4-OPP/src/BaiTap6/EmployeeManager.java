package BaiTap6;

import java.util.Scanner;

public class EmployeeManager {
        private static Employee[] employees = new Employee[100];
        private  static  int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--------Quản lí Nhân Viên--------");
            System.out.println(
                    "1.Hiển thị danh sách tất cả học sinh\n" +
                    "2.Thêm mới học sinh\n" +
                    "3.Sửa thông tin học sinh dựa vào mã học sinh\n" +
                    "4.Xoá học sinh\n" +
                    "5.Thoát\n");
            System.out.println("Nhập lựa chọn của bạn: " );
            byte choice = scanner.nextByte();
            switch (choice){
                case 1:// Hiển thị
                    showEmployee();
                    break;
                case 2:// Thêm mới
                    createEmployee();
                    break;
                case 3:// Cập nhật theo id
                    System.out.println("Nhập id cần chỉnh sửa: ");
                    int idEdit = scanner.nextInt();
                    updateEmployee(idEdit);
                    break;
                case 4:// Xóa theo id
                    System.out.println("Nhập id cần xóa: ");
                    int idDel = scanner.nextInt();
                    deleteEmployee(idDel);
                    break;
                case 5:// Thoát
                    System.exit(0);
                    break;
                default:
                    // Nhập sai
                    System.out.println("Nhập sai nhập lại!!!");
                    break;
            }
        }
    }

        public static void createEmployee(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Số lượng nhân viên cần thêm mới: ");
            int quanity = scanner.nextInt();
            if (quanity> employees.length-count){
                System.out.println("Vượt quá số lượng cho phép!!!");
                return;
            }
            for (int i = 0; i < quanity; i++) {
                Employee newEmployee = new Employee();
                System.out.println("Nhập thông tin cho sinh viên thứ "+(i+1));
                System.out.println("Nhập id: ");
                newEmployee.setEmployeeId(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Nhập tên nhân viên: ");
                newEmployee.setEmployeeName(scanner.nextLine());
                System.out.println("Nhập tuổi: ");
                newEmployee.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Nhập giới tính: ");
                newEmployee.setGen(scanner.nextLine());
                System.out.println("Nhập hệ số lương: ");
                newEmployee.setRate(scanner.nextDouble());
                employees[count]=newEmployee;
                count++;
            }
            System.out.println("Thêm mới thành công!!!");
        }
        public static void showEmployee(){
        if (count==0){
            System.out.println("Danh sách trống!");
            return;
        }
        // Hiển thị danh sách
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
        public static void updateEmployee(int idEdit){
            Scanner scanner = new Scanner(System.in);
            int index = getIndexByEmployeeId(idEdit);
            if (index==-1){
                System.out.println("Không tìm thấy nhân viên!!!");
                return;
            }
            // Cho phép sửa
            System.out.println("--------Thông tin sinh viên cũ---------");
            System.out.println(employees[index]);
            System.out.println("Nhập mới tên nhân viên: ");
            employees[index].setEmployeeName(scanner.nextLine());
            System.out.println("Nhập tuổi: ");
            employees[index].setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập giới tính: ");
            employees[index].setGen(scanner.nextLine());
            System.out.println("Nhập hệ số lương: ");
            employees[index].setRate(scanner.nextDouble());
            System.out.println("Cập nhật thành công!!!");
        }
        public static void deleteEmployee(int idDelete){
            int index = getIndexByEmployeeId(idDelete);
            if (index==-1){
            System.out.println("Không tìm thấy nhân viên!!!");
            return;
        }
            for (int i = index+1; i < count; i++) {
               employees[i-1]=employees[i];
            }
            employees[count-1]=null;
            count--;
            System.out.println("Xóa thành công!!!");
        }
        public static int getIndexByEmployeeId(int id){
            for (int i = 0; i < count; i++) {
                if (id==employees[i].getEmployeeId()){
                    return i;
                }
            }
            return -1;
        }
}
