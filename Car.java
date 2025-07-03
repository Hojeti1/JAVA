public class Car{
    String brand;
    int speed;

    public Car(){
    }

    public void display(){
        System.out.println("Brand: "+ this.brand +", Speed: " + this.speed + " km/h");
    }

    public static void main(String[] var0) {
        Car var1 = new Car();
        var1.brand = "Toyota";
        var1.speed = 120;
        var1.display();

        Car var2 = new Car();
        var2.brand = "Benz"
        var2.speed = 120;
        var2.display();
    }
}