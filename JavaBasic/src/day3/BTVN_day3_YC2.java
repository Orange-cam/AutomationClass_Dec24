package day3;
import java.util.Scanner;
public class BTVN_day3_YC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Arr = new int[5];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            Arr[i] = scanner.nextInt();

        if (Arr[i] % 2 == 0 && Arr[i] % 3 == 0) {
                System.out.println("Điều kiện thoát xảy ra");
                return;
            }
            else {
                System.out.println("Phần tử được nhập là " + Arr[i]);
            }
        }
    }
}
