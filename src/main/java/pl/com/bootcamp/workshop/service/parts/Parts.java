package pl.com.bootcamp.workshop.service.parts;

/**
 * Created by Raynor on 2017-07-04.
 */
public class Parts {

    private int id;
    private String name;
    private int price;
    private int howManyInStorage;

    public Parts(int id, String name, int price, int howManyInStorage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.howManyInStorage = howManyInStorage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHowManyInStorage() {
        return howManyInStorage;
    }

    public void setHowManyInStorage(int howManyInStorage) {
        this.howManyInStorage = howManyInStorage;
    }
}
