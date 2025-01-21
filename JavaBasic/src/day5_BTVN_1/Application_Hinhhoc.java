package day5_BTVN_1;
import java.util.Scanner;

public class Application_Hinhhoc {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập bán kính: ");
    double banKinh = scanner.nextDouble();
    HinhTron tron = new HinhTron (banKinh);
    tron.setTenHinh ("Hình Tròn");
    System.out.println("Tên hình: " + tron.getTenHinh());
    tron.tinhDienTich();

    System.out.print("Nhập chiều dài cạnh a: ");
    double chieuDai = scanner.nextDouble();
    System.out.print("Nhập chiều dài cạnh b: ");
    double chieuRong = scanner.nextDouble();
    HinhChuNhat chuNhat = new HinhChuNhat(chieuDai, chieuRong);
    chuNhat.setTenHinh("Hình Chữ Nhật");
    System.out.println("Tên hình: " + chuNhat.getTenHinh());
    chuNhat.tinhDienTich();

    }
}