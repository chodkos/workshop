package pl.com.bootcamp.workshop.service.parts;

import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
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


    private RowMapper<Parts> productRowMapper = (rs, rowNum) -> {

                        int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int howManyinStorage = rs.getInt("howmanyinstorage");
                        return new Parts(id, name, price, howManyinStorage);
            };

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addPart(String name, int price, int howManyInStorage) {
            jdbcTemplate.update("INSERT INTO parts VALUES (?, ?, ?)", name, price, howManyInStorage );
    }

    @Override
    public Parts findPartByName(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM parts WHERe name =?" , productRowMapper, name);
    }

    @Override
    public Parts findPartById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM parts WHERe id =?" , productRowMapper, id);
    }


    @Override
    public List<Parts> findAllParts() {
        return jdbcTemplate.query("SELECT * FROM parts", new RowMapper<Parts>()  {
            @Override
            public Parts mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int howManyInStorage = resultSet.getInt("howmanyinstorage");
                return new Parts(id, name, price, howManyInStorage);

            }
        });
    }
}
