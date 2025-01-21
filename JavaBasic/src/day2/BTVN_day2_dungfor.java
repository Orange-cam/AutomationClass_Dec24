package day2;

import java.util.Scanner;
public class BTVN_day2_dungfor {
    public static void main(String[] args) {
        Scanner nhapMang = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = nhapMang.nextInt();
        int [] mang = new int [n];
        System.out.println("Nhập các phần tử của mảng bên dưới: ");
        for (int i=0; i<n; i++) {
            System.out.print("Phần tử "+ (i+1) +": ");
            mang[i] = nhapMang.nextInt();
        }
        System.out.print("Các phần tử của mảng là: ");

    }
}