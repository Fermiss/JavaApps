import java.util.Date;

public class Directory {
    private String dayOfWeek;
    private Date time;
    private String event;
    private String name;
    private String number;

    public Directory(String dayOfWeek, Date time, String event, String name, String number) {
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.event = event;
        this.name = name;
        this.number = number;
    }
    public Directory(Directory directory){
        this.dayOfWeek = directory.getDayOfWeek();
        this.time = directory.getTime();
        this.event = directory.getEvent();
        this.name = directory.getName();
        this.number = directory.getNumber();
    }
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return name + ";" + number + ";" + event + ";" +time + ";"+dayOfWeek;
    }
}
