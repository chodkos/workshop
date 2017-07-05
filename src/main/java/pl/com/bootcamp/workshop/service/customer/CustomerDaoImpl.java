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
    public Customer findCustomer(int id) {
        return null;
    }

    @Override
    public Customer findCustomer(String name) {
        /*return jdbcTemplate.query("SELECT * FROM customer WHERE name LIKE ?", new RowMapper<Customer>(){
           @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                return new Customer(name);
            }
        });*/ return null;
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", new RowMapper<Customer>()  {
            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                return new Customer(name);

            }
        });
    }
}
