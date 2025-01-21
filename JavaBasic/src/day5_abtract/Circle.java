package day5_abtract;

public class Circle extends Shape {
    @Override
    public void draw () {
        System.out.println ("Draw circle with one round by "+getColor());
    }
}