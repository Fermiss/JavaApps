package BaseClasses;

public class Order {
    private int id;
    private int client_id;
    private int worker_id;
    private int cassette_id;
    private String startDate;
    private String endDate;

    public Order(int id, int client_id, int worker_id, int cassette_id, String startDate, String endDate) {
        this.id = id;
        this.client_id = client_id;
        this.worker_id = worker_id;
        this.cassette_id = cassette_id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public int getCassette_id() {
        return cassette_id;
    }

    public void setCassette_id(int cassette_id) {
        this.cassette_id = cassette_id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString(){
        return id + " " + client_id + " " + worker_id + " " + cassette_id + " " + startDate + " " + endDate;
    }
}
