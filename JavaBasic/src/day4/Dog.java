package day4;

public class Dog {
    public static String name;
    public static String breed;
    public static String age;
    public static String color;

    public static void getInfo (){
        System.out.println("name: "+name+ ", bread: "+breed+ ", age: "+age+ ", color: "+color );
    }

    public static void main(String[] args) {
        // TODO: Auto-generated method stub
        Dog beggie = new Dog ();
        Dog.name="Orange";
        Dog.breed = "Corgi";
        Dog.age = "2";
        Dog.color= "white";
        beggie.getInfo();

        Dog fog = new Dog ();
        Dog.name="Red";
        Dog.breed = "fog";
        Dog.age = "2";
        Dog.color= "black";
        fog.getInfo();

    }
}