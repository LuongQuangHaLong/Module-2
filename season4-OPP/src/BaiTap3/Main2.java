package BaiTap3;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        StopWatch watch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }
        System.out.println(Arrays.toString(arr));
        watch.start();
        sort(arr);
        watch.stop();
        System.out.println("Thoi gian sap xep : " +watch.getElapsedTime());
    }
    public static void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
