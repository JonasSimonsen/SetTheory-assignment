/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import java.util.HashSet;

/**
 *
 * @author jonassimonsen
 */
public class Complement {

    public void SetComplement(HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer> c = new HashSet<>();

// Bruger for loop

//        for (Integer integer : a) {
//            if (b.contains(integer)) {
//                b.remove(integer);
//            }
//        }
//        System.out.println(b);

// Bruger indbyggede funktioner

        c.addAll(a);
        c.removeAll(b);

        System.out.println(c);
    }
}
