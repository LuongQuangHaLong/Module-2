import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2. Tính chu vi và diện tích hình tam giác\n" +
                    "3. Tính chu vi và diện tích hình tròn.\n" +
                    "4. Thoát.\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chiều dài:");
                    int cd = sc.nextInt();
                    System.out.println("Chiều rộng:");
                    int cr = sc.nextInt();
                    int sHcn = cd * cr;
                    int pHcn = (cd + cr) * 2;
                    System.out.println("Chu vi hình chữ nhật: P = " + pHcn);
                    System.out.println("Diện tích hình chữ nhật: S = " + sHcn);
                    break;

                case 2:
                    while (true) {
                        System.out.println("Cạnh thứ nhất: ");
                        double a = sc.nextDouble();
                        System.out.println("Cạnh thứ hai: ");
                        double b = sc.nextDouble();
                        System.out.println("Cạnh thứ ba: ");
                        double c = sc.nextDouble();
                        if (a > 0 && b > 0 && c > 0 && a + b > c && c + b > a && a + c > b) {
                            double pHtg = a + b + c;
                            double thamSo = pHtg / 2;
                            double sHtg = Math.sqrt(thamSo * (thamSo - a) * (thamSo - b) * (thamSo - c));
                            System.out.println("Chu vi hình tam giác: P = " + pHtg);
                            System.out.println("Diện tích hình tam giác: S = " + sHtg);
                            break;
                        } else {
                            System.out.println("Nhập lại");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Bán kính:");
                    double bk = sc.nextDouble();
                    double sHt = Math.PI * bk * bk;
                    double pHt = 2 * Math.PI * bk;
                    System.out.println("Chu vi hình tròn: P = " + pHt);
                    System.out.println("Diện tích hình tròn: S = " + sHt);
                    break;

                case 4:
                    System.out.println("Thoát chương trình");
                    return; // Sử dụng return để thoát khỏi phương thức main
                default:
                    System.out.println("Nhập không hợp lệ");
            }
        }
    }
}
