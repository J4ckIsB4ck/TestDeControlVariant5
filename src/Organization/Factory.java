package Organization;

public class Factory extends Organization {
    private String typeOfProduct;

    public Factory(String name, String address, String typeOfProduct) {
        super(name, address);
        this.typeOfProduct = typeOfProduct;
    }

    @Override
    public void displayInformation() {
        System.out.println("Factory: " + name + ", Address: " + address + ", Type of Product: " + typeOfProduct);
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
}


