package day3;
import java.util.Arrays;
public class BTVN_day3_YC1_YC3 {
    public static void main(String[] args) {
        int[] Arr = {12, 30, 5, 25, 10, 15, 90};
        System.out.print("Thứ tự ban đầu của mảng là: " + Arrays.toString(Arr) + System.lineSeparator());
        sapXepGiamDan(Arr);
        System.out.print("Giá trị mảng giảm dần: ");
        inMangDaSapXep(Arr);
        System.out.println();
        timGiaTriNhoNhat(Arr);
        timGiaTriLonNhat(Arr);
    }

    public static void sapXepGiamDan(int[] Arr) {
        int temp;
        for (int i = 0; i < Arr.length; i++)
            for (int j = 0; j < Arr.length - 1; j++) {
                if (Arr[j] < Arr[j + 1]) {
                    temp = Arr[j + 1];
                    Arr[j + 1] = Arr[j];
                    Arr[j] = temp;
                }
            }
    }

    public static void inMangDaSapXep(int[] Arr) {
        for (int i = 0; i < Arr.length; i++)
            System.out.print(Arr[i] + " ");
    }

    public static void timGiaTriNhoNhat(int[] Arr) {
        int min = Arr[0]; // Giả sử phần tử đầu tiên là nhỏ nhất
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
    public static void timGiaTriLonNhat(int[] Arr) {
        int max = Arr[0]; // Giả sử phần tử đầu tiên là lớn nhất
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}