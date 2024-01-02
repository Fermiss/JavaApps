package BaseClasses;

public class Position {
    private int id;
    private String name;
    private int salary;
    private String responsibilities;
    private String requirements;

    public Position(int id, String name, int salary, String responsibilities, String requirements) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.requirements = requirements;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + salary + " " + responsibilities + " " + requirements;
    }
}
