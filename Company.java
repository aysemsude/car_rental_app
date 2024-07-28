package car_rental_app;

public class Company extends Customer{

    String company_name;
    String tax_number;

    public Company (String telno,String email,int year_of_licence,String company_name,String tax_number){

        super(telno,email,year_of_licence);
        this.company_name=company_name;
        this.tax_number=tax_number;

    }

    @Override
    public boolean canRent(Vehicle vehicle) {
        return true;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getTax_number() {
        return tax_number;
    }

    public void setTax_number(String tax_number) {
        this.tax_number = tax_number;
    }
}
