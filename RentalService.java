package car_rental_app;

import java.util.List;
import java.util.ArrayList;

public class RentalService {
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    public List<Vehicle> get_available_vehicles_for_customer(Customer customer) {
        List<Vehicle> available_vehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {                  //vehicles listesinden customera uygun olan aaçların gelmesini sağlar
            if (!vehicle.is_rented && customer.canRent(vehicle)) {
                available_vehicles.add(vehicle);
            }
        }
        return available_vehicles;
    }

    public void return_vehicle(Customer customer, Vehicle vehicle) {  //customerın arabayı return etmesi için
        customer.return_car(vehicle);

}

    public void rent_vehicle(Customer customer,Vehicle vehicle){        //customerın arabayı kiralaması için
        customer.rent_the_car(vehicle);
    }


}
