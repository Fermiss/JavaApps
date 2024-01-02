import java.util.Scanner;

public class Circle {
    private int[] center = new int[2];
    private float radius;

    public Circle(){
        this.center[0] = 0;
        this.center[1] = 0;

        Scanner input = new Scanner(System.in);
        this.radius = input.nextInt();

    }

    public Circle(int radius, int[] center){
        this.radius = radius;
        this.center = center;
    }

    public int square(){
        return (int) (Math.PI * radius * radius);
    }

    public void shift(int i){
        center[0] += i;
    }

    public int[] getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }

    public static boolean areInOneQuarter(Circle a, Circle b){
        return a.quarter() == b.quarter();
    }

    public int quarter(){
        int result = 0;
        if (center[0] > 0)
        {
            if (center[1] > 0)
                result = 1;
            else if (center[1] < 0)
                result = 2;
        }
        else
        {
            if (center[1] > 0)
                result = 4;
            else if (center[1] < 0)
                result = 3;
        }
        return result;
    }
}
