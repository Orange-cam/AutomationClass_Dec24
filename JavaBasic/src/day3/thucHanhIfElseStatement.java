package day3;

public class thucHanhIfElseStatement {
    public static void main(String[] args) {
        System.out.println ("Cac so nho hon 100 va chia het cho 5 la: ");
        inSoChiaHetCho5();
    }
    public static void inSoChiaHetCho5() {
        for (int i=100; i>=0 ; i--)
        {
            if (i%5==0)
                System.out.print (i + " ");
        }
    }
}

