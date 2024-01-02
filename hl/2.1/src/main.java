import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       task();
    }
    public static void task(){
        String A = "ИНТГЕРАЛ";
        String B = "ГРАФ";
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)){
                    B = B.replace(A.charAt(i), ' ');
                    A = A.replace(A.charAt(i), ' ');
                }
            }
        }
        if (B.isBlank()){
            System.out.println("Ok");
        }else {
            System.out.println("Impossible");
        }
    }
}
