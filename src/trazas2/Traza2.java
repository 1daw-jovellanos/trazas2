package trazas2;

import java.util.*;
public class Traza2 {

    
    
    public int bar(String s, int i, Set<Integer> k) {
        s = "dum";
        i++;
        Set<Integer> k2 = k;
        k2.addAll(Arrays.asList(7, 8));
        return k2.size();
    }
    
    public void runRunRunNanMeomchulSugaEobseo() {
        Set<Integer> miSet = new TreeSet<>();
        miSet.addAll(Arrays.asList(4, 5, 6, 5, 4, 2, 9, 2 + 4));
        String s = "foo";
        int j = 22;
        // s es inmutable; j pasa por valor; miSet es mutable.
        bar(s, j, miSet);
        // nada de lo que haya ocurrido en bar puede alterar s porque es inmutable
        // nada de lo que haya ocurrido en bar cambia j, porque bar ha recibido sólo el valor de j (copiado)
        System.out.format("%s %d - ", s, j); // Sin mirar lo que pase en bar: s es "foo" y j es 22.
        // miSet sí ha podido ser alterado por bar, porque es mutable.
        for (int i : miSet) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        new Traza2().runRunRunNanMeomchulSugaEobseo();
    }
}
