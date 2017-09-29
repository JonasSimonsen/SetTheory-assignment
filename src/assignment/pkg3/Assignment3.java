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
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Union union = new Union();
        Difference dif = new Difference();
        Intersection inter = new Intersection();
        Membership member = new Membership();
        Complement comp = new Complement();

        Integer[] a = {1, 2, 3, 5, 6, 7, 8, 10};
        Integer[] b = {1, 3, 4, 6, 8, 9, 10, 11};
        Set<Integer> sa = new Set(a);
        Set<Integer> sb = new Set(b);
        Set<Integer> sc = new Set(true);
        
        System.out.println("\nUnion");
        union.SetUnion(sa, sb);
        union.SetUnion(sc, sb);

        System.out.println("\nDifference");
        dif.SetDifference(sa, sb);
        dif.SetDifference(sc, sb);

        System.out.println("\nIntersetion");
        inter.SetIntersection(sa, sb);
        inter.SetIntersection(sc, sb);

        System.out.println("\nMembership");
        member.SetMembership(0, sb);
        member.SetMembership(1, sb);
        member.SetMembership(2, sc);

        System.out.println("\nComplement");
        comp.SetComplement(sa, sb);
        comp.SetComplement(sa, sc);
    }
}
