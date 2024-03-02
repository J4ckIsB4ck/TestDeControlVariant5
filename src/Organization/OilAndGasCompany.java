package Organization;

public class OilAndGasCompany extends Organization {
    private double productionPerDay;

    public OilAndGasCompany(String name, String address, double productionPerDay) {
        super(name, address);
        this.productionPerDay = productionPerDay;
    }

    @Override
    public void displayInformation() {
        System.out.println("Oil and Gas Company: " + name + ", Address: " + address + ", Production per day: " + productionPerDay + " barrels");
    }

    public double getProductionPerDay() {
        return productionPerDay;
    }

    public void setProductionPerDay(double productionPerDay) {
        this.productionPerDay = productionPerDay;
    }
}
