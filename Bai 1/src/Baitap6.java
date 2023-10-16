import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = sc.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println(num+ " chia hết cho 3 và 5");
        } else if (num%3==0) {
            System.out.println(num+ " chỉ chia hết cho 3");
        } else if (num%5==0) {
            System.out.println(num + " chỉ chia hết cho 5");
        } else {
            System.out.println(num + " không chia hết cho cả 3 và 5");
        }
    }
}
