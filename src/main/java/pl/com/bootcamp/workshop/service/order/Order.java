package pl.com.bootcamp.workshop.service.order;

import pl.com.bootcamp.workshop.service.customer.Customer;
import pl.com.bootcamp.workshop.service.employee.Employee;
import pl.com.bootcamp.workshop.service.parts.Parts;
import pl.com.bootcamp.workshop.service.service.Service;

import java.util.List;

/**
 * Created by Raynor on 2017-07-04.
 */
public class Order {

    private int id;
    private Employee employee;
    private Customer customer;
    private List<Service> serviceList;
    private List<Parts> partsList;


}
