package automation.testsuite;
import org.testng.annotations.*;
public class NhanVien {
    @Test
    public void NhapTenNhanVien () {
        String [] NhanVien = {"Nhan","Cam"};
        System.out.println("Danh sach nhan vien:");
        for (String name : NhanVien) {
            System.out.println(" "+ name);
        }
    }
}