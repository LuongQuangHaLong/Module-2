import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chiều dài: ");
        int lengh = sc.nextInt();
        System.out.println("Chiều rộng: ");
        int width = sc.nextInt();
        int p = (lengh+width)*2;
        int s = lengh*width;
        System.out.println("Chu vi: P ="+p);
        System.out.println("Diện tích: S= "+s);
    }
}
