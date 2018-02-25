package bikinibottom;

public class Snail implements SeaBeing {
    static int c;
    static String n;
    static {
        c = 0;
    }
    public Snail(String s) {
        c++;
        n = s;
    }
    
    public int foo() {
        return c;
    }
    
    public int bar(int i) {
        return i + c;
    }
}
