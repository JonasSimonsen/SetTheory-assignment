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
        
        
        HashSet a = new HashSet();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(10);
        
        
        HashSet b = new HashSet();
        b.add(1);
        b.add(3);
        b.add(4);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);
        b.add(11);
        
        
        System.out.println("Union");
        union.SetUnion(a, b);
        
        System.out.println("Difference");
        dif.SetDifference(a, b);
        
        System.out.println("Intersetion");
        inter.SetIntersection(a, b);
        
        System.out.println("Membership");
        System.out.println(member.SetMembership(0, b));
        System.out.println(member.SetMembership(1, b));
        System.out.println(member.SetMembership(2, b));
        
        System.out.println("Complement");
        comp.SetComplement(a, b);
        
        
        
        
        
    }
    
}
