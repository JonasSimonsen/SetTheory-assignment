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

    public void SetComplement(Set<Integer> a, Set<Integer> b) {

    ArrayList<Comparable> c = new ArrayList();
    
    boolean bool = true;

        for (Integer bInt : b.getValues() ) {
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
        System.out.println(c);
    }
}
