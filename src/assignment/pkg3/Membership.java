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

        if (b.infinite) {
            System.out.println("One of the sets was infinite!");
            return;
        }

        for (Integer integer : b.getValues()) {
            if (integer == a) {
                System.out.println("True");
            }
        }
        System.out.println("False");
    }
}
