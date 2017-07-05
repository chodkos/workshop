package pl.com.bootcamp.workshop.service.customer;

/**
 * Created by Raynor on 2017-07-04.
 */
public class Customer {

    private int id;
    private String name;

    public Customer(String name) {

        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
