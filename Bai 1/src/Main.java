public class Main {
    static int global ; // phải thêm static thì mới có thể gọi trong main
    public static void main(String[] args) {// hàm phương thức dùng để bắt đầu ứng dụng
        System.out.println("Hello world!");
        // khai bao bien
        // không xác định được giá trị nếu không gán
        // biến a là biến địa phương- biến local
        int a = 10;
        double d = 5.6;
        float f =3.2f; // ép về boolean
        boolean check = true;
        short sh = 100;
        long l = 1000;
        char c = '.';
        System.out.println("giá trị của biến a " +a);
        System.out.println("giá trị của biến d " +d);
        System.out.println("giá trị của biến f " +f);
        System.out.println("giá trị của biến check " +check);
        System.out.println("giá trị của biến sh " +sh);
        System.out.println("giá trị của biến l " +l);
        System.out.println("giá trị của biến c " +c);
        System.out.println(global);

        //chuỗi
        
    }
}