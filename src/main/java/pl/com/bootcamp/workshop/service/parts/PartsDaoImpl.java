package pl.com.bootcamp.workshop.service.parts;

import jdk.nashorn.internal.scripts.JD;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import pl.com.bootcamp.workshop.service.customer.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Raynor on 2017-07-04.
 */
public class PartsDaoImpl implements PartsDao {


    private JdbcTemplate jdbcTemplate;

    @Override
    public void addPart(String name, int price) {

    }

    @Override
    public Parts findByName(String name) {
        return null;
    }

    @Override
    public List<Parts> findAll() {
        return jdbcTemplate.query("SELECT * FROM parts", new RowMapper<Customer>()  {
            @Override
            public Parts mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int howManyInStorage = resultSet.getInt("howmanyinstorage");
                return new Parts(name, price, howManyInStorage);

            }
        });
    }
}
