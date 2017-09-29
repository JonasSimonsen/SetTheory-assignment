/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author jonassimonsen
 */
public class Membership {

    public void SetMembership(int a, Set<Integer> b) {

        //Check if the set is infinite, and breaks if it is
        if (b.infinite) {
            System.out.println("The set is infinite!");
            return;
        }

        //Loop through all values in the set, if a match is found, break
        for (Integer integer : b.getValues()) {
            if (integer == a) {
                System.out.println("True");
                return;
            }
        }
        //No match
        System.out.println("False");
    }
}
