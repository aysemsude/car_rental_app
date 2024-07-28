package car_rental_app;

public class Sedan extends Vehicle {

    int discount_rate;

    public Sedan(String brand, String model, String segment, String color, String gear_type, int trunk_capacity, int age, String fuel_type, double daily_rental, int limit_of_km, int capacity, int deposit, int year_of_licence, int discount_rate) {
        super(brand, model, segment, color, gear_type, trunk_capacity, age, fuel_type, daily_rental, limit_of_km, capacity, deposit, year_of_licence);
        this.discount_rate = discount_rate;
        this.is_rented=false;//ilk üretimde false işaretliyoruz kiralanma durumunu

    }

    @Override
    public double calculate_monthly_price() {
        double discount;
        discount = (30 * getDaily_rental() * discount_rate) / 100;
        return 30 * getDaily_rental() - discount;
    }
}
