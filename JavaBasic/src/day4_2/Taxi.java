package day4_2;

public class Taxi {
    public static void main(String[] args) {
        // TODO: Auto-generated method stub
        Xe taxi = new Xe();
        taxi.setTenXe("Xanh SM");
        taxi.setLoaiXe("Vincar");
        taxi.setVanTocMax("200 km/h");
        System.out.println("Ten xe: "+taxi.getTenXe() + ", Loai xe: "+taxi.getLoaiXe() + ", Toc do max: "+taxi.getVanTocMax());
    }
}