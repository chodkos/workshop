package pl.com.bootcamp.workshop.service.parts;

/**
 * Created by Raynor on 2017-07-04.
 */
public class Parts {

    private int id;
    private String name;
    private int price;
    private int howManyInStorage;

    public Parts(String name, int price, int howManuInStorage) {
        this.name = name;
        this.price = price;
        this.howManyInStorage = howManuInStorage;
    }
}
