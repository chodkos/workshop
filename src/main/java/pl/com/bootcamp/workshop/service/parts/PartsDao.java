package pl.com.bootcamp.workshop.service.parts;

import java.util.List;

/**
 * Created by Raynor on 2017-07-04.
 */
public interface PartsDao {

    void addPart(String name, int price, int howManyInStorage);

    Parts findPartByName(String name);

    Parts findPartById(int id);

    List<Parts> findAllParts();
}
