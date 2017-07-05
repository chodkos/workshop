package pl.com.bootcamp.workshop.service.customer;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Raynor on 2017-07-04.
 */
public class CustomerDaoImpl implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(Customer customer) {
        jdbcTemplate.update("INSERT INTO customer(name) VALUE (?)", customer.getName());
    }


    @Override
    public Customer findCustomer(String name) {
        return null;
    }

    @Override
    public List<Customer> findAll(String name) {
        return jdbcTemplate.query("SELECT * FROM customer", new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                return new Customer(id, name);

            }
        });
    }
}
