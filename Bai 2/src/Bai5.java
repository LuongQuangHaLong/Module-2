public class Bai5 {
    public static void main(String[] args) {
        boolean check = true;
        int n = 1;
        while (check){
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0){
                check = false;
            } else { n++;}
        }
        if (check == false){
            System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5,7,11 là: " + n);
        }
    }
}
