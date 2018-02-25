/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trazas2;

import java.util.*;
import bikinibottom.*;

/**
 *
 * @author victor
 */
public class Splash {

    List<SeaBeing> gang;

    public Splash() {
        gang = new ArrayList<>();
    }

    public void kick() {
        gang.add(new Snail("Gary"));
        gang.add(new SquarePants("Spongebob"));
        gang.add(new Snail("Sandy"));
        gang.add(new SquarePants("Patrick"));
    }

    public int deep() {
        int c = 0;
        for (SeaBeing s : gang) {
            if (s instanceof Snail) {
                System.out.print("s");
                ((Snail) s).bar(c);
            } else {
                System.out.print('p');
                ((SquarePants) s).bar("MrKrabs");
            }
            c += s.foo();
        }

        if (0 <= c) {
            return c;
        }
        int deadCode = 1;
        gang.remove(deadCode);
        return c;
    }

    public void diveFast() {
        kick();
        int pull = deep();
        System.out.print(pull);
        System.out.print(gang.size());
    }

    public static void main(String[] args) {
        new Splash().diveFast();
    }
}
