package day3;
import java.util.Scanner;
public class thucHanhVongLap {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 50; i = i+2){
            System.out.println (i+ " ");
            sum = sum + i;
        }
        System.out.println ("Tong day so la: "+sum);
    }
}
