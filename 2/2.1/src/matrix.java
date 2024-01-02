public class matrix {
    private int n;
    private int m;
    private char[][] matrix;
    public matrix(){
        this.matrix = new char[][]{{'а', 'г', 'и'},
                                   {'е', 'о', 'к'},
                                   {'р', 'о', 'л'}};
        n = 3;
        m = 3;
    }
    private String getStringMatrix(){
        String stringMatrix ="";
        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < m; k++) {
                stringMatrix += matrix[j][k];
                //stringMatrix += " ";
            }
        }
        return stringMatrix;
    }
    private String deleteFromMatrixString(char del, String str){
        int pos = 0;
        for (int i = 0; i < str.length(); i++) {
            if (del == str.charAt(i)){
                pos = i;
                break;
            }
        }
        return str.substring(0, pos) + str.substring(pos+1);
    }
    public void task(String inputStr){
        String strMatrix = getStringMatrix();
        StringBuilder s1 = new StringBuilder(strMatrix);
        int count = 0;
        while(count < inputStr.length()){
            if (strMatrix.contains(Character.toString(inputStr.charAt(count)))) {
                deleteFromMatrixString(inputStr.charAt(count), strMatrix);
            }
            else{
                break;
            }
            count++;
        }
        if (count == inputStr.length()){
            System.out.println("It's okay");
        }else {
            System.out.println("Not okay");
        }
    }
    public void print(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
