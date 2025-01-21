package day5_abtract;

public class Rectangle extends Shape {
    @Override
    public void draw () {
        System.out.println("Draw rectangle with 4 lines by "+getColor());
    }
}