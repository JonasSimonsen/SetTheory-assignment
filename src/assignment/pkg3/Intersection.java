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
public class Intersection {

    public void SetIntersection(HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer> c = new HashSet<Integer>();

        for (Integer integer : a) {
            if (b.contains(integer)) {
                c.add(integer);
            }
        }
        System.out.println(c);
    }
}
