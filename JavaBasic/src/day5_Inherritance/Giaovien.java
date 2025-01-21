package day5_Inherritance;

public class Giaovien extends Nguoi {
    public String monDay;

    public void diDay(){
        System.out.println("Giáo vien Codestar dạy: " + monDay + "Tối thứ 4 và chủ nhật");
    }
    @Override
    public void diChoi () {
        System.out.println("GV đi chơi sau khi kết thúc khoá dạy");
    }
}