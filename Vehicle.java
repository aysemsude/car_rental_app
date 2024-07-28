package car_rental_app;

public abstract class Vehicle {

    private String brand;
    private String model;
    private String segment;
    private String color;
    private String gear_type;
    private int trunk_capacity;
    private int age;
    private String fuel_type;
    private double daily_rental;
    private int limit_of_km;
    private int capacity;
    private int deposit;
    private int year_of_licence;
    boolean is_rented;


    // bu sınıftan nesne üretilemiyor olsa bile subclasasından türetilecek nesneler ilk olarak bu constructorı çağıracakları için sahip olmasını istediğimiz özellikleriyle constructor ı yazıyoruz.
    public Vehicle(String brand, String model, String segment, String color, String gear_type, int trunk_capacity, int age, String fuel_type, double daily_rental, int limit_of_km, int capacity, int deposit, int year_of_licence) {
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.color = color;
        this.gear_type = gear_type;
        this.trunk_capacity = trunk_capacity;
        this.age = age;
        this.fuel_type = fuel_type;
        this.daily_rental = daily_rental;
        this.limit_of_km = limit_of_km;
        this.capacity = capacity;
        this.deposit = deposit;
        this.year_of_licence = year_of_licence;
    }

    public abstract double calculate_monthly_price();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSegment() {
        return segment;
    }

    public String getColor() {
        return color;
    }

    public String getGear_type() {
        return gear_type;
    }

    public int getTrunk_capacity() {
        return trunk_capacity;
    }

    public int getAge() {
        return age;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public double getDaily_rental() {
        return daily_rental;
    }

    public int getLimit_of_km() {
        return limit_of_km;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getYear_of_licence() {
        return year_of_licence;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGear_type(String gear_type) {
        this.gear_type = gear_type;
    }

    public void setTrunk_capacity(int trunk_capacity) {
        this.trunk_capacity = trunk_capacity;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setDaily_rental(double daily_rental) {
        this.daily_rental = daily_rental;
    }

    public void setLimit_of_km(int limit_of_km) {
        this.limit_of_km = limit_of_km;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setYear_of_licence(int year_of_licence) {
        this.year_of_licence = year_of_licence;
    }

    public boolean isIs_rented() {
        return is_rented;
    }

    public void setIs_rented(boolean is_rented) {
        this.is_rented = is_rented;
    }
}
