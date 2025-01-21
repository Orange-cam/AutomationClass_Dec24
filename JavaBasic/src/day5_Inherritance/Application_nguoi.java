package day5_Inherritance;

public class Application_nguoi {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien ();
        sv1.setHoTen("Nguyen Van A");
        sv1.setDiaChi("Da Nang");
        sv1.setNgaySinh("19/9/2004");
        sv1.GPA = 4;
        System.out.println(sv1.getHoTen() + ", " + sv1.getDiaChi() + ", "+ sv1.getNgaySinh() + ", "+ sv1.GPA);
        sv1.diHoc();
        sv1.diChoi();

        Giaovien gv1 = new Giaovien();
        gv1.setHoTen("Nguyen Van B");
        gv1.setDiaChi("Ha Noi");
        gv1.setNgaySinh("01/01/1990");
        gv1.monDay = "Auto test";
        System.out.println(gv1.getHoTen() + ", " + gv1.getDiaChi() + ", "+ gv1.getNgaySinh() + ", "+ gv1.monDay);
        gv1.diChoi();
    }
}