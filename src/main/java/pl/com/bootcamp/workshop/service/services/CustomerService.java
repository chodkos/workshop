package pl.com.bootcamp.workshop.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.bootcamp.workshop.service.customer.CustomerDao;

/**
 * Created by Raynor on 2017-07-04.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
