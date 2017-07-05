package pl.com.bootcamp.workshop.service.services;

import pl.com.bootcamp.workshop.service.customer.CustomerDao;

/**
 * Created by Raynor on 2017-07-04.
 */
public class CustomerService {

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
