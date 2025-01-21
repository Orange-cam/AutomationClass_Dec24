package day5_Thuchanh;

public class TinhLuong {
    // public String loaiBacSi;
    // public int heSoLuong;
    // public double luongCoBan = 10000000;

    public double tinhLuong(double _heSoLuong, double _luongCoBan)
    { return _heSoLuong*_luongCoBan; }

    public double tinhLuong(double _heSoLuong, double _luongCoBan, double soNamKinhNghiem)
    { return _heSoLuong*_luongCoBan*soNamKinhNghiem; }

    public double tinhLuong(double _heSoLuong, double _luongCoBan, double soNamKinhNghiem, String loaiBS)
    {
        if (loaiBS .equals("Chuyen Khoa")){
            return _heSoLuong*_luongCoBan*soNamKinhNghiem*0.2+ _luongCoBan*0.2;
        }
        else if (loaiBS.equals("Da Khoa")){
            return _heSoLuong*_luongCoBan*soNamKinhNghiem*0.45 + _luongCoBan*0.45;
        }
        else
            return _heSoLuong*_luongCoBan*soNamKinhNghiem;
    }

    public static void main(String[] args) {
        TinhLuong bs = new TinhLuong();
        System.out.println(String.format("%.0f", bs.tinhLuong(0.2,10000000,10,"Chuyen Khoa")));
        System.out.println(String.format("%.0f", bs.tinhLuong(0.3,10000000,10,"Da Khoa")));
        System.out.println(String.format("%.0f", bs.tinhLuong(0.2,10000000,10,"Y Ta")));
    }
}