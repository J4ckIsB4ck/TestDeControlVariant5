package Organization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Organization> organizations = new ArrayList<>();
        organizations.add(new InsuranceCompany("Insurance", "123 St, City", "Life Insurance"));
        organizations.add(new OilAndGasCompany("OilGas", "456 St, Town", 10000));
        organizations.add(new Factory("Widget Factory", "789 St, Village", "Widgets"));
        organizations.add(new InsuranceCompany("Family Insurance", "321 St, City", "Health Insurance"));
        organizations.add(new OilAndGasCompany("GreenEnergy", "654 St, Town", 5000));
        organizations.add(new Factory("Gadget Factory", "987 St, Village", "Gadgets"));

        System.out.println("Original Organizations:");
        for (Organization organization : organizations) {
            organization.displayInformation();
        }

        String insuranceTypeFilter = "Life Insurance";
        double oilProductionFilter = 10000;
        String productTypeFilter = "Widgets";
        String healthInsuranceTypeFilter = "Health Insurance";
        String gadgetProductTypeFilter = "Gadgets";

        System.out.println("\nFiltered by Insurance Type: " + insuranceTypeFilter + " and Oil Production: " + oilProductionFilter);
        filterOrganizations(organizations, insuranceTypeFilter, oilProductionFilter, null);

        System.out.println("\nFiltered by Product Type: " + productTypeFilter + " and Oil Production: " + oilProductionFilter);
        filterOrganizations(organizations, null, oilProductionFilter, productTypeFilter);

        System.out.println("\nFiltered by Health Insurance Type: " + healthInsuranceTypeFilter);
        filterOrganizations(organizations, healthInsuranceTypeFilter, 0, null);

        System.out.println("\nFiltered by Gadget Product Type: " + gadgetProductTypeFilter);
        filterOrganizations(organizations, null, 0, gadgetProductTypeFilter);
    }

    public static void filterOrganizations(List<Organization> organizations, String insuranceType, double oilProduction, String productType) {
        for (Organization organization : organizations) {
            if (organization instanceof InsuranceCompany && insuranceType != null) {
                InsuranceCompany insuranceCompany = (InsuranceCompany) organization;
                if (insuranceCompany.getTypeOfInsurance().equals(insuranceType)) {
                    organization.displayInformation();
                }
            } else if (organization instanceof OilAndGasCompany && oilProduction > 0) {
                OilAndGasCompany oilAndGasCompany = (OilAndGasCompany) organization;
                if (oilAndGasCompany.getProductionPerDay() >= oilProduction) {
                    organization.displayInformation();
                }
            } else if (organization instanceof Factory && productType != null) {
                Factory factory = (Factory) organization;
                if (factory.getTypeOfProduct().equals(productType)) {
                    organization.displayInformation();
                }
            }
        }
    }
}
