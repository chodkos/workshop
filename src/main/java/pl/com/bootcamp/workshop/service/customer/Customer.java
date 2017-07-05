package pl.com.bootcamp.workshop.service.customer;

/**
 * Created by Raynor on 2017-07-04.
 */
public class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
