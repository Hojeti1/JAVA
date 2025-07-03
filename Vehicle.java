abstract class Vehicle{
    protected String model;
    public Vehicle(String model){
        this.model = model;
    }

    abstract void start();
    public void display(){
        System.out.println("Model: " + model);

    }
}

interface Rentable{
    double calculateRentalCost(int days);
}

class Car extends Vehicle implements Rentable {
    public Car(String model) {
        super(model);
    }
    @Override
    void start(){
        System.out.println(model + "Car started with key ignition.");
    }
    @Override
    public double calculateRentalCost(int days){
        return days * 50.0;
    }
}

public class Main{
    public static void main(String[] args) {
        Car car = new Car("Toyota camry");
        car.display();
        car.start();
        System.out.println("Rental Cost for 3 days: $" + car.calculateRentalCost(3));
    }
}
