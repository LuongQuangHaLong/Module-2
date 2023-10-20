import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Cạnh thứ nhất: ");
            double a = sc.nextDouble();
            System.out.println("Cạnh thứ hai: ");
            double b = sc.nextDouble();
            System.out.println("Cạnh thứ ba: ");
            double c = sc.nextDouble();
            if (a > 0 && b > 0 && c > 0 && a+b>c && c+b>a && a+c>b ) {
                double chuVi = Math.floor(a + b + c);
                double i = chuVi/2;
                double dienTich = Math.sqrt(i*(i-a)*(i-b)*(i-c));
                System.out.println("Chu vi hình tam giác: P = " + chuVi);
                System.out.println("Diện tích hình tam giác: S = " + dienTich);
                break;
            } else {
                System.out.println("hay nhap lai cac canh cua tam giac");
            }
        }
    }
}
