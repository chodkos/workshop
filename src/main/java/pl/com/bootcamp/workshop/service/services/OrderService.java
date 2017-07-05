package pl.com.bootcamp.workshop.service.services;

import pl.com.bootcamp.workshop.service.customer.CustomerDaoImpl;
import pl.com.bootcamp.workshop.service.employee.EmployeeDaoImpl;
import pl.com.bootcamp.workshop.service.order.OrderDaoImpl;
import pl.com.bootcamp.workshop.service.parts.PartsDaoImpl;
import pl.com.bootcamp.workshop.service.service.ServiceDaoImpl;

/**
 * Created by Raynor on 2017-07-04.
 */
public class OrderService {

    private CustomerDaoImpl customerDao;
    private EmployeeDaoImpl employeeDao;
    private OrderDaoImpl orderDao;
    private PartsDaoImpl partsDao;
    private ServiceDaoImpl serviceDao;

    public void setCustomerDao(CustomerDaoImpl customerDao) {
        this.customerDao = customerDao;
    }

    public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setOrderDao(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
    }

    public void setPartsDao(PartsDaoImpl partsDao) {
        this.partsDao = partsDao;
    }

    public void setServiceDao(ServiceDaoImpl serviceDao) {
        this.serviceDao = serviceDao;
    }
}
