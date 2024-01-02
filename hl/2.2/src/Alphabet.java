public class Alphabet {
    public static StringBuilder alphabet =new StringBuilder("абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
    public static int getNumOfChar(char f){
        return alphabet.indexOf(Character.toString(f));
    }
    public static char getCharByNum(int i){
        if (i<0)
            return alphabet.charAt(i+33);
        else
            return alphabet.charAt(i%33);
    }
}
