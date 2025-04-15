import java.util.Scanner;
 
class Vehicle {
   private final String brand;
   private final int speed;
   private final String fuelType;
   public Vehicle(String brand, int speed, String fuelType) {
       this.brand = brand;
       this.speed = speed;
       this.fuelType = fuelType;
   }
   public String getBrand() {
       return brand;
   }
   public int getSpeed() {
       return speed;
   }
   public String getFuelType() {
       return fuelType;
   }
   public void displayInfo() {
       System.out.println("Brand: " + brand);
       System.out.println("Speed: " + speed + " km/h");
       System.out.println("Fuel Type: " + fuelType);
   }
}
 
class Car extends Vehicle {
   private final int numDoors;
   public Car(String brand, int speed, String fuelType, int numDoors) {
       super(brand, speed, fuelType);
       this.numDoors = numDoors;
   }
   @Override
   public void displayInfo() {
       super.displayInfo();
       System.out.println("Number of Doors: " + numDoors);
   }
}
 
class Motorcycle extends Vehicle {
   private final boolean hasSidecar;
   public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
       super(brand, speed, fuelType);
       this.hasSidecar = hasSidecar;
   }
   @Override
   public void displayInfo() {
       super.displayInfo();
       System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
   }
}
 
 class testVehicle {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.println("Enter Car Details:");
           System.out.print("Brand: ");
           String carBrand = scanner.nextLine();
           System.out.print("Speed (km/h): ");
           int carSpeed = scanner.nextInt();
           scanner.nextLine();
           System.out.print("Fuel Type: ");
           String carFuel = scanner.nextLine();
           System.out.print("Number of Doors: ");
           int numDoors = scanner.nextInt();
           scanner.nextLine();
           Car car = new Car(carBrand, carSpeed, carFuel, numDoors);
           
           System.out.println("\nEnter Motorcycle Details:");
           System.out.print("Brand: ");
           String motoBrand = scanner.nextLine();
           System.out.print("Speed (km/h): ");
           int motoSpeed = scanner.nextInt();
           scanner.nextLine();
           System.out.print("Fuel Type: ");
           String motoFuel = scanner.nextLine();
           System.out.print("Has Sidecar (true/false): ");
           boolean hasSidecar = scanner.nextBoolean();
           Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);
           
           System.out.println("\nCar Information:");
           car.displayInfo();
           System.out.println("\nMotorcycle Information:");
           motorcycle.displayInfo();
       }
   }
}

