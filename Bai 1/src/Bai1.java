import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số a:");
        int a = sc.nextInt();
        System.out.println("Số b:");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 2 từ " +a+ " đến " +b+" là:" +sum );

    }
}
