package pl.com.bootcamp.workshop.service.gui;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.bootcamp.workshop.service.services.CustomerService;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Raynor on 2017-07-04.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AppTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void shouldRunContext() throws Exception {
        assertThat(customerService).isNotNull();
    }

}
