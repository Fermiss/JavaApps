package BaseClasses;

public class Cassette {
    private int id;
    private String name;
    private int year;
    private String maker;
    private String country;
    private String producer;
    private int genre_id;
    private int price;

    public Cassette(int id, String name, int year, String maker, String country, String producer, int genre_id, int price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.maker = maker;
        this.country = country;
        this.producer = producer;
        this.genre_id = genre_id;
        this.price = price;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + year + " " + maker + " " + country + " " + producer + " " + genre_id + " " + price;
    }
}
