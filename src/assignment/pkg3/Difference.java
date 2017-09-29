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
public class Difference {
    
    public void SetDifference (HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer> c = new HashSet<Integer>(a);

        c.removeAll(b);
        System.out.println(c);

    }
    
    
    
}
