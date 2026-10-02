public class Car {
    private String name;
    private String color;
    private int power;
    private int speed;

    public void   setInfo(String name, String color, int power, int speed){
        this.name = name;
        this.color = color;
        this.power = power;
        this.speed = speed;
    }

    public void output(){
        System.out.println("A " + color + " color " + name + " car of " + power + "hp is running at " + speed + "km/hr.");

    }
}
