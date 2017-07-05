package pl.com.bootcamp.workshop.service.customer;

import java.util.List;

/**
 * Created by Raynor on 2017-07-04.
 */
public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer findCustomer(String name);

    Customer findCustomer(int id);

    List<Customer> findAll();

}
