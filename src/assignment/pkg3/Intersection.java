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
public class Intersection {

    public void SetIntersection(Set<Integer> a, Set<Integer> b) {

        ArrayList<Comparable> c = new ArrayList();

        //Check if one of the sets are infinite and breaks if is
        if (a.infinite || b.infinite) {
            System.out.println("One of the sets was infinite!");
            return;
        }

        //Loops through all values, if a match is found, add to temporary List
        for (Integer aInt : a.getValues()) {
            for (Integer bInt : b.getValues()) {
                if (aInt == bInt) {
                    c.add(aInt);
                }
            }
        }
        //Print temporary list
        System.out.println(c);
    }
}
