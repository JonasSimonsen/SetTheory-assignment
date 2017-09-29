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
        Integer[] c = {1, 2, 3, 5, 6}; //subset of a
        Set<Integer> sa = new Set(a);
        Set<Integer> sb = new Set(b);
        Set<Integer> sc = new Set(c);
        Set<Integer> sd = new Set(true);

        System.out.println("Union");
        union.SetUnion(sa, sb); // All numbers in a and b
        union.SetUnion(sd, sb); // One set is infite
        union.SetUnion(sa, sc); // One of the sets is subset of the other
        union.SetUnion(sd, sd); // Both sets are infinite
        union.SetUnion(sa, sa); // Sets are the same

        System.out.println("\nDifference");
        dif.SetDifference(sa, sb); // Differences between a and b
        dif.SetDifference(sd, sb); // One set is infite
        dif.SetDifference(sa, sc); // One of the sets is subset of the other
        dif.SetDifference(sd, sd); // Both sets are infinite
        dif.SetDifference(sa, sa); // Sets are the same

        System.out.println("\nIntersetion");
        inter.SetIntersection(sa, sb); // All numbers that appear in both a and b
        inter.SetIntersection(sd, sb); // One set is infite
        inter.SetIntersection(sa, sc); // One of the sets is subset of the other
        inter.SetIntersection(sd, sd); // Both sets are infinite
        inter.SetIntersection(sa, sa); // Sets are the same

        System.out.println("\nMembership");
        member.SetMembership(0, sb); // 0 is not a member of b
        member.SetMembership(1, sb); // 1 is a member of b
        member.SetMembership(2, sd); // 2 the set is infinite

        System.out.println("\nComplement");
        comp.SetComplement(sa, sb); // All remaining number is b 
        comp.SetComplement(sa, sd); // One set is infite
        comp.SetComplement(sa, sc); // One of the sets is subset of the other
        comp.SetComplement(sd, sd); // Both sets are infinite
        comp.SetComplement(sa, sa); // Sets are the same
    }
}
