public class Chemical_elements {
    private int id;
    private String name;
    private int atom_height;
    private int valence;
    private double density;
    private String color;

    public Chemical_elements(String name, int atom_height, int valence, double density, String color, int id) {
        this.name = name;
        this.atom_height = atom_height;
        this.valence = valence;
        this.density = density;
        this.color = color;
        this.id = id;
    }
    public Chemical_elements(){};
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtom_height() {
        return atom_height;
    }

    public void setAtom_height(int atom_height) {
        this.atom_height = atom_height;
    }

    public int getValence() {
        return valence;
    }

    public void setValence(int valence) {
        this.valence = valence;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return id+" "+name+" "+valence+" "+ density+" "+color+" "+atom_height;
    }
}
