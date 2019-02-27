/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trazas2;

import java.util.*;

public class IWantALittleSugarInMyBowl {

    public void piano(Collection<String> eunice) {
        Iterator<String> iter = eunice.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            s = s + "#";
        }
    } 
    
    public void nina() {
        Set<String> simone = new HashSet<>();;
        simone.addAll(Arrays.asList(
                "I", "want", "a", "little", "sweetness",
                "down", "in", "my", "soul"
        ));
        simone.retainAll(Arrays.asList(
                "drop", "a", "little", "sugar",
                "in", "my", "bowl"
        ));
        piano(simone);
        List<String> words = new LinkedList();
        words.addAll(simone);
        Collections.sort(words);
        for (String word: words) {
            System.out.print(word);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        new IWantALittleSugarInMyBowl().nina();
    }

}
