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
public class Complement {

    /**
     * Finds everything that is not in set a
     *
     * @param a first set
     * @param b second set
     */
    public void SetComplement(Set<Integer> a, Set<Integer> b) {

        ArrayList<Comparable> c = new ArrayList();

        boolean bool = true;

        //Check if one of the sets are infinite and breaks if is
        if (a.infinite || b.infinite) {
            System.out.println("One of the sets was infinite!");
            return;
        }

        //Loops through both sets and if match is found, break, 
        //and add all remaining values to temporary list
        for (Integer bInt : b.getValues()) {
            for (Integer aInt : a.getValues()) {
                if (aInt == bInt) {
                    bool = true;
                    break;
                }
                bool = false;
            }
            if (!bool) {
                c.add(bInt);
            }
        }
        //Prints temporary list
        System.out.println(c);
    }
}
