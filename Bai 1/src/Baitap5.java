import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Toán: ");
        double toan = sc.nextDouble();
        System.out.println("Lý: ");
        double ly = sc.nextDouble();
        System.out.println("Hóa: ");
        double hoa = sc.nextDouble();
        System.out.println("Văn: ");
        double van = sc.nextDouble();
        System.out.println("Anh: ");
        double anh = sc.nextDouble();
        double tb = (toan+ly+hoa+van+anh)/5;
        if (tb<5) {
            System.out.println("Điểm trung bình: " + tb);
            System.out.println("Xếp loại Yếu");
        } else if (tb<6.5) {
            System.out.println("Điểm trung bình: "+ tb);
            System.out.println("Xếp loại Trung Bình");
        } else if (tb<8) {
            System.out.println("Điểm trung bình: "+ tb);
            System.out.println("Xếp loại Khá");
        } else if (tb<10) {
            System.out.println("Điểm trung bình: "+ tb);
            System.out.println("Xếp loại Giỏi");
        }
    }
}
