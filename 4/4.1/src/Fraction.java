public class Fraction {
    private int m;//числитеть
    private int n;//знаменатель
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Fraction() {
        this.m = 1;
        this.n = 2;
        this.number = 1;
    }
    public Fraction(int m, int n, int number) {
        if (n==0){
            this.n=1;
        }else {
            this.m = m;
            this.n = n;
            this.number = number;
        }
    }
    public void setM(int m) {
        this.m = m;
    }
    public void setN(int n) {
        this.n = n;
    }
    public float toDecimal(){
        return (float)m/(float)n;
    }
    static Fraction plus(Fraction first, Fraction second){
        Fraction ret = new Fraction();
        ret.m = first.m * second.n + second.m * first.n;
        ret.n = first.n * second.n;
        int divider = getDivider(ret.m, ret.n);
        ret.m /= divider;
        ret.n /= divider;
        return ret;
    }
    static Fraction minus(Fraction first, Fraction second){
        Fraction ret = new Fraction();
        ret.m = first.m * second.n - second.m * first.n;
        ret.n = first.n * second.n;
        int divider = getDivider(ret.m, ret.n);
        ret.m /= divider;
        ret.n /= divider;
        return  ret;
    }
    static Fraction multiply(Fraction first, Fraction second){
        Fraction ret = new Fraction();
        ret.n = first.n * second.n;
        ret.m = first.m * second.m;
        int divider = getDivider(ret.n, ret.m);
        ret.n /=divider;
        ret.m /=divider;
        return  ret;
    }
    public static int getDivider(int a, int b){
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    @Override
    public String toString(){
        return (m+"/"+n);
    }
    public  void increaseNumerator(int inc){
        this.m += inc;
    }
    public  void increaseDenominator(int inc){
        this.n += inc;
    }
}
