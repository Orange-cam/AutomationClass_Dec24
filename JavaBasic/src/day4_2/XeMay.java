package day4_2;

public class XeMay {
    public static void main(String[] args) {
        // TODO: Auto-generated method stub
        Xe xeMay = new Xe ();
        xeMay.setTenXe("Lead");
        xeMay.setLoaiXe("Honda");
        xeMay.setVanTocMax("120 km/h");
        System.out.println("Ten xe: "+xeMay.getTenXe() + ", Loai xe: "+xeMay.getLoaiXe() + ", Toc do max: "+xeMay.getVanTocMax());
    }
}