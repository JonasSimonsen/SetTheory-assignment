/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import java.util.ArrayList;

/**
 *
 * @author jonassimonsen
 */
public class Difference {

    public void SetDifference(Set<Integer> a, Set<Integer> b) {

        ArrayList<Integer> c = new ArrayList();
        
        if(a.infinite || b.infinite) {
        System.out.println("One of the sets was infinite!");
        return;
    }

        for (Integer aInt : a.getValues()) {
            boolean bool = true;
            for (Integer bInt : b.getValues()) {
                if (aInt == bInt) {
                    bool = false;
                }
            }
            if (bool) {
                c.add(aInt);
            }
        }
        System.out.println(c);
    }
}
