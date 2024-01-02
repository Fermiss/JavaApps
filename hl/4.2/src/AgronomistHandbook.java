public class AgronomistHandbook {
    private String nameCulture; //название культуры
    private String nameFertilizer; // название удобрения
    private int applicationRate; // норма внесения на 100 м кв.
    private int month;
    private int content; // содержание в ед. объёма ( в одном метре)

    public AgronomistHandbook(String nameCulture, String nameFertilizer, int applicationRate, int month, int content) {
        this.nameCulture = nameCulture;
        this.nameFertilizer = nameFertilizer;
        this.applicationRate = applicationRate;
        this.month = month;
        this.content = content;
    }

    public AgronomistHandbook(AgronomistHandbook handbook){
        this.nameCulture = handbook.nameCulture;
        this.nameFertilizer = handbook.nameFertilizer;
        this.applicationRate = handbook.applicationRate;
        this.month = handbook.month;
        this.content = handbook.content;
    }

    public String getNameCulture() {
        return nameCulture;
    }

    public void setNameCulture(String nameCulture) {
        this.nameCulture = nameCulture;
    }

    public String getNameFertilizer() {
        return nameFertilizer;
    }

    public void setNameFertilizer(String nameFertilizer) {
        this.nameFertilizer = nameFertilizer;
    }

    public int getApplicationRate() {
        return applicationRate;
    }

    public void setApplicationRate(int applicationRate) {
        this.applicationRate = applicationRate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString(){ return nameCulture + ";" + nameFertilizer + ";" + applicationRate + ";" + month + ";" + content;}
}
