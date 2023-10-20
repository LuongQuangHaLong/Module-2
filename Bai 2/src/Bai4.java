import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        int n = 2;
        System.out.printf("%d số nguyên tố đầu tiên: ", num);
        while (count < num){
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check){
                System.out.print(n +" ");
                count++;
            }
            n++;
        }
    }
}
