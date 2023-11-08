package BaiTap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        watch.start(); // bat dau bam gio
        while (true){
            int so = Integer.parseInt(scanner.nextLine());
            if (so==0){
                watch.stop(); // ket thuc bam gio
                break;
            }
        }
        System.out.println("Thoi gian chech lech : "+watch.getElapsedTime()+" miliseconds ");
    }
}
