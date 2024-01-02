import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(cipher(str, 4).toString());
        System.out.println(decode(cipher(str, 4).toString(), 4).toString());
    }
    private static StringBuilder cipher(String str, int offset){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(Alphabet.getCharByNum(Alphabet.getNumOfChar(str.charAt(i))+ offset));
        }
        return result;
    }
    private static StringBuilder decode(String str, int offset){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(Alphabet.getCharByNum(Alphabet.getNumOfChar(str.charAt(i)) - offset));
        }
        return result;
    }
}
