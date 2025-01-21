package day4_BTVN;

public class Developer {
    public static void main(String[] args) {
        // TODO: Auto-generated method stub
        Employee dev1 = new Employee();
        dev1.setEmployee_id("15");
        dev1.setEmployee_name("Erik");
        //dev1.getEmployee_salary("1000 USD");
        System.out.println("Mã số Dev1: "+dev1.getEmployee_id()+ ", Tên Dev1: "+dev1.getEmployee_name()+ ", Lương Dev1: "+dev1.getEmployee_salary());
    }
} //Khi biến Salary ở dạng private và ko có getter method cho nó thì class kế thừa sẽ ko thể gán giá trị cho biến này và sẽ trả kết quả là null
