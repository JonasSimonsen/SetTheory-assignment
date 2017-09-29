/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jonassimonsen
 */
public class Union {

    public void SetUnion(Set<Integer> a, Set<Integer> b) {

    ArrayList<Comparable> c = new ArrayList();

        for (Integer aInt : a.getValues() ) {
            for (Integer bInt : b.getValues()) {
                if (!c.contains(bInt)) {
                    c.add(bInt);
                }
                if (!c.contains(aInt)) {
                    c.add(aInt); 
                } 
            }
        }
        Collections.sort(c);
        System.out.println(c);
    }
}
