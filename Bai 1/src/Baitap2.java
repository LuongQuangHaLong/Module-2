import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Nhập số tiền: ");
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
        System.out.println("Số tiền sau khi chuyển: " +change*rate +"VND");
    }

}
