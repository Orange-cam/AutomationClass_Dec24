package day5_BTVN_1;

public class HinhChuNhat extends Hinhhoc {
    public double chieuDai;
    public double chieuRong;
    public HinhChuNhat (double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhDienTich () {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Diện tích "+ getTenHinh()+ " = " + dienTich);
    }

}