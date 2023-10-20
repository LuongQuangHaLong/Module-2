import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2.Kiểm tra số nguyên tố.\n" +
                    "3.Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4.Thoát\n");
            System.out.println("Hãy nhập vào lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine()); // Đọc lựa chọn
            switch (choice) {
                case 1:
                    System.out.println("Nhập số:");
                    int a = Integer.parseInt(sc.nextLine()); // Đọc số và loại bỏ ký tự Enter thừa
                    if (a % 2 == 0) {
                        System.out.println(a + " là số chẵn.");
                    } else {
                        System.out.println(a + " là số lẻ.");
                    }
                    break;

                case 2:
                    System.out.println("Nhập số:");
                    int b = Integer.parseInt(sc.nextLine()); // Đọc số và loại bỏ ký tự Enter thừa

                    boolean check = true;
                    if (b <= 1) {
                        check  = false;
                    } else {
                        for (int i = 2; i <= b / 2; i++) {
                            if (b % i == 0) {
                                check  = false;
                                break; // Nếu số không phải là số nguyên tố, thoát khỏi vòng lặp
                            }
                        }
                    }
                    if (check ) {
                        System.out.println(b + " là số nguyên tố.");
                    } else {
                        System.out.println(b + " không là số nguyên tố.");
                    }
                    break;

                case 3:
                    System.out.println("Nhập số:");
                    int c = Integer.parseInt(sc.nextLine()); // Đọc số và loại bỏ ký tự Enter thừa
                    if (c % 3 == 0) {
                        System.out.println(c + " chia hết cho 3.");
                    } else {
                        System.out.println(c + " không chia hết cho 3.");
                    }
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ.");
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
