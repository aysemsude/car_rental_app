package car_rental_app;

public class Suv extends Vehicle {

    public Suv (String brand, String model, String segment, String color, String gear_type, int trunk_capacity, int age, String fuel_type, double daily_rental, int limit_of_km, int capacity, int deposit, int year_of_licence){
        super(brand, model, segment, color, gear_type, trunk_capacity, age, fuel_type, daily_rental, limit_of_km, capacity, deposit, year_of_licence);
    }

    @Override
    public double calculate_monthly_price() {
        throw new UnsupportedOperationException("Cannot rent monthly");

        }


    }
