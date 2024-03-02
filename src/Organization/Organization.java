
package Organization;

import java.util.ArrayList;
import java.util.List;


public abstract class Organization {
    String name;
    String address;

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void displayInformation();
}
