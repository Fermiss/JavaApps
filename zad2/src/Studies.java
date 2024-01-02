import java.util.Arrays;

public class Studies {
    private String fullName;
    private  int[] marks;

    public Studies(String fullName, int[] marks) {
        this.fullName = fullName;
        this.marks = marks;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getSumMarks(){
        return Arrays.stream(marks).sum();
    }

    public String toString(){
        return fullName + " " + Arrays.toString(marks);
    }
}
