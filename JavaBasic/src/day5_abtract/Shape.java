package day5_abtract;

public abstract class Shape {
    private String color = "red";
    public String getColor () {
        return this.color;
    }
    public abstract void draw ();
    }
