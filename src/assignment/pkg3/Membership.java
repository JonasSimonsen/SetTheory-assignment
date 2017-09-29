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
public class Membership {

    public boolean SetMembership(int a, HashSet<Integer> b) {

        return b.contains(a);
    }
}
