package car_rental_app;

import java.util.ArrayList;
import java.util.List;

public abstract  class Customer {
    private String telno;
    private String email;
    private int year_of_licence;
    private List<Vehicle> rented_vehicles_by_customer;// her kullanıcıya kiraladığı araçlar için liste atama

    public Customer(String telno,String email,int year_of_licence){
        this.email=email;
        this.telno=telno;
        this.year_of_licence=year_of_licence;
        this.rented_vehicles_by_customer=new ArrayList<>();//kullanıcı oluşturulurken boş liste atama
    }
    public abstract boolean canRent(Vehicle vehicle);//müşteri kiralayabilir mi
    public boolean rent_the_car(Vehicle vehicle) {
        if (vehicle.is_rented) {
            System.out.println("Vehicle is already rented.");
            return false;
        }
        if (canRent(vehicle)) {
            vehicle.setIs_rented(true);
            rented_vehicles_by_customer.add(vehicle); //eğer customer kiralayabiliyorsa ve daha önce kiralanmadıysa cuatomerın listesine ekle ve mesaj dön
            System.out.println("Vehicle rented successfully.");
            return true;
        } else {
            System.out.println("This customer cannot rent this type of vehicle.");
            return false;
        }
    }
    public void return_car(Vehicle vehicle) {
        if (rented_vehicles_by_customer.remove(vehicle)) {
            vehicle.setIs_rented(false);                        //araç customer tarafından kiralanmışsa listeden silme ve aracın iralanma durumunu false a geri çekme
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("This vehicle was not rented by this customer.");
        }
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear_of_licence() {
        return year_of_licence;
    }

    public void setYear_of_licence(int year_of_licence) {
        this.year_of_licence = year_of_licence;
    }

    public List<Vehicle> getRented_vehicles_by_customer() {
        return rented_vehicles_by_customer;
    }

    public void setRented_vehicles_by_customer(List<Vehicle> rented_vehicles_by_customer) {
        this.rented_vehicles_by_customer = rented_vehicles_by_customer;
    }
}

