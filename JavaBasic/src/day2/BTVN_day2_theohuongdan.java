package day2;

import java.util.Scanner;
public class BTVN_day2_theohuongdan {
    public static void main(String[] args) {
        int x, y, z;
        double ketqua;
        Scanner mangSo = new Scanner(System.in);
        System.out.print ("Nhap so thu nhat: ");
        x = mangSo.nextInt();
        System.out.print ("Nhap so thu hai: ");
        y = mangSo.nextInt();
        System.out.print ("Nhap so thu ba: ");
        z = mangSo.nextInt();
        ketqua = (x/y)-z;
        System.out.print ("Ket qua cua: " + "So thu nhat" + " chia cho so thu hai" + " roi tru cho so thu 3 "+ " la: "+ketqua);
    }
}
