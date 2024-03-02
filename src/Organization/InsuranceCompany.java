package Organization;

public class InsuranceCompany extends Organization {
    private String typeOfInsurance;

    public InsuranceCompany(String name, String address, String typeOfInsurance) {
        super(name, address);
        this.typeOfInsurance = typeOfInsurance;
    }

    @Override
    public void displayInformation() {
        System.out.println("Insurance Company: " + name + ", Address: " + address + ", Type of Insurance: " + typeOfInsurance);
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }
}

