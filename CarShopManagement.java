// Abstract class representing a Car
abstract class Car {
    private String model;
    private double price;
    private int year;

    public Car(String model, double price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void displayInfo();
}

class ElectricCar extends Car {
    private double batteryCapacity;  

    public ElectricCar(String model, double price, int year, double batteryCapacity) {
        super(model, price, year);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electric Car Model: " + getModel());
        System.out.println("Price: $" + getPrice());
        System.out.println("Year: " + getYear());
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class GasolineCar extends Car {
    private double fuelCapacity;  

    public GasolineCar(String model, double price, int year, double fuelCapacity) {
        super(model, price, year);
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Gasoline Car Model: " + getModel());
        System.out.println("Price: $" + getPrice());
        System.out.println("Year: " + getYear());
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

public class CarShopManagement {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla Model S", 79999.99, 2023, 100.5);
        GasolineCar gasolineCar = new GasolineCar("Ford Mustang", 55999.99, 2022, 60.0);

        System.out.println("Electric Car Details:");
        electricCar.displayInfo();

        System.out.println("\nGasoline Car Details:");
        gasolineCar.displayInfo();
    }
}

class dieselcar extends car{
    private int milage;
    public dieselcar(String model, double price, int year, int milage)
    super(model, price,year);
    this.milage = milage

    public int getmilage(){
        
    }

}