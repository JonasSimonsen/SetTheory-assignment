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

    public boolean SetMembership(int a, Set<Integer> b) {

        for (Integer integer : b.getValues()) {
            if (integer == a) {
                return true;
            }
        }
        return false;
    }
}
