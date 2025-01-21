package day3;
import java.util.Scanner;
public class thucHanhIfElse {
    public static void main(String[] args) {
        //timSoChanLe ();
        //timSoLonHon();
        System.out.println ("So lon hon la: "+timSoLonHon2());
    }
    public static void timSoChanLe (){
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhap vao so bat ky: ");
        int number = scanner.nextInt();
        if (number %2 == 0) {
            result = "So chan";}
        else {
            result = "So le"; }
        result = (number%2==0) ? "So chan" : "So le";
        System.out.println (result);}

    public static void timSoLonHon () {
        int st1, st2;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Nhap so thu nhat: ");
        st1 = scanner.nextInt();
        System.out.println ("Nhap so thu hai: ");
        st2 = scanner.nextInt();
        int result = (st1 > st2) ? st1:st2;
        System.out.println ("So lon hon la: "+result);
    }
    public static int timSoLonHon2() {
        int st1, st2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        st1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        st2 = scanner.nextInt();
        if (st1 > st2)
            return st1;
        else
            return st2;
    }
    }
