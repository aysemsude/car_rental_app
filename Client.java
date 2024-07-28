package car_rental_app;

public class Client extends Customer{
    private String name;
    private String last_name;
    private String id_number;

    public Client(String telno,String email,int year_of_licence,String name,String last_name,String id_number){
        super(telno,email,year_of_licence);
        this.id_number=id_number;
        this.name=name;
        this.last_name=last_name;
    }

    @Override
    public boolean canRent(Vehicle vehicle) {
        if(vehicle instanceof Sedan ||vehicle instanceof Hatchback)
            return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
}
