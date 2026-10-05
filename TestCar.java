class Car {

    // Private instance variables
    private String plateNumber;
    private String carModel;
    private double dailyRentalRate;
    private boolean rented;

    // Static variables
    private static String companyName = "Diiriye Rental";
    private static int totalCars = 0;

    // No-argument constructor
    public Car() {
        plateNumber = "SO12345";
        carModel = "Tx Toyota";
        dailyRentalRate = 35.0;
        rented = false;
        totalCars++;
    }

    // Parameterized constructor
    public Car(String plateNumber, String carModel, double dailyRentalRate) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;

        // Validation
        if (dailyRentalRate < 0) {
            this.dailyRentalRate = 0.0;
        } else {
            this.dailyRentalRate = dailyRentalRate;
        }

        rented = false;
        totalCars++;
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getDailyRentalRate() {
        return dailyRentalRate;
    }

    public boolean isRented() {
        return rented;
    }

    // Setter for daily rental rate
    public void setDailyRentalRate(double dailyRentalRate) {
        if (dailyRentalRate < 0) {
            System.out.println("Rental rate cannot be negative.");
        } else {
            this.dailyRentalRate = dailyRentalRate;
            System.out.println("Rental rate changed successfully.");
        }
    }

    // Rent method
    public void rent() {
        if (rented) {
            System.out.println("Car " + plateNumber + " is already rented.");
        } else {
            rented = true;
            System.out.println("Car " + plateNumber + " has been rented.");
        }
    }

    // Return car method
    public void returnCar() {
        if (rented) {
            rented = false;
            System.out.println("Car " + plateNumber + " has been returned.");
        } else {
            System.out.println("Car " + plateNumber + " is already available.");
        }
    }

    // Display car information
    public void displayInfo() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Car Model: " + carModel);
        System.out.println("Daily Rental Rate: $" + dailyRentalRate);
        System.out.println("Status: " + (rented ? "Rented" : "Available"));
    }

    // Static method for company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Static method for total cars
    public static void displayTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }
}


// TestCar class
public class TestCar {

    public static void main(String[] args) {
        Car.displayCompanyName();
        Car car1 = new Car();
        Car car2 = new Car("SO1234", "Toyota Corolla", 50.0);

        System.out.println("\nCar 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();

        // Rent car
        System.out.println("\nRenting Car 2:");
        car2.rent();

        System.out.println("\nTrying to rent Car 2 again:");
        car2.rent();

        System.out.println("\nReturning Car 2:");
        car2.returnCar();
        System.out.println("\nChanging Car 2 rental rate:");
        car2.setDailyRentalRate(60.0);

        System.out.println("\nUpdated Car 2 Information:");
        car2.displayInfo();


        Car.displayTotalCars();
    }
}
