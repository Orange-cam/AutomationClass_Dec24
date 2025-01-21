package day4;

public class Motor {
    public static String Hang;
    public static String Mauxe;
    public static String Bienso;
    public static String Ngaydangky;

    public static void getInfo (){
        System.out.println("Hang: "+Hang+ ", Mau xe: "+Mauxe+ ", Bien so: "+Bienso+ ", Ngay Dang ky: "+Ngaydangky);
    }

    public static void main(String[] args) {
        // TODO: Auto-generated method stub
        Motor honda = new Motor ();
        honda.Hang = "Honda";
        honda.Mauxe = "Navy";
        honda.Bienso = "12345";
        honda.Ngaydangky = "1/1/2025";
        honda.getInfo();

        Motor suzuki = new Motor ();
        suzuki.Hang = "Suzuki";
        suzuki.Mauxe = "White";
        suzuki.Bienso = "12345";
        suzuki.Ngaydangky = "1/1/2025";
        suzuki.getInfo();

    }
}