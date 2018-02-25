package bikinibottom;

public class SquarePants implements SeaBeing {
    
    private int c;
    private String n;
    public SquarePants(String s) {
        this.n = s;
        this.c = s.length();
    }
    
    public int foo() {
        return (c + 1);
    }
    
    public void bar(String s) {
        c = s.length();
    }
    
}
