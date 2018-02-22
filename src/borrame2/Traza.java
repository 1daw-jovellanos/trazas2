/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borrame2;

import java.util.*;
public class Traza {
    List<String> l = new LinkedList<>() ;
    
    public void foo(char c) {
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            if (iter.next().endsWith(String.valueOf(c))) {
                iter.remove();
            }
        }
    }
    
    public void correr() {
        l.addAll(Arrays.asList("Gingko", "Boj", "Camelia", "Jazmín", "Magnolia"));
        Collections.sort(l);
        Collections.reverse(l);
        String s = "bar";
        for (int i = 0; i < s.length(); i++) {
            foo(s.charAt(i));
        }
        l.forEach(e -> System.out.format("#%s#", e));
    }
    
    public static void main(String[] args) {
        new Traza().correr();
    }
}
