package day5_BTVN_1;

public class HinhTron extends Hinhhoc {
    public double banKinh;
    public HinhTron (double banKinh){
        this.banKinh = banKinh;}

    @Override
    public void tinhDienTich () {
        double dienTich = 3.14* banKinh * banKinh;
        System.out.println("Diện tích "+ getTenHinh()+ " = " + dienTich);}
}