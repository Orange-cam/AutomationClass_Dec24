package day2;

public class Person {
    private static String name;
    private static String email;
    private static String phoneNumber;

    public static void main (String[] args) {
	name = "Cam Dang";
	email = "cam@gmail.com";
	phoneNumber = "+849999999";
	System.out.println(name + " " + email + " " + phoneNumber);
	tinhToan (12, 30, 10);
    }
    public static void tinhToan (int st1, double st2, int st3)
    {
        double ketQua = (st1*st2)/st3;
        System.out.println("Ket qua la: "+ketQua);
    }
}
