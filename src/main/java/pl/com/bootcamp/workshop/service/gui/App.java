package pl.com.bootcamp.workshop.service.gui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.bootcamp.workshop.service.services.OrderService;

/**
 * Created by Raynor on 2017-07-04.
 */
public class App {


    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
    }


}
