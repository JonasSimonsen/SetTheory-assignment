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
public class Set<E extends Comparable> {
    
    boolean infinite = false;
    E[] values; 

    public Set(E[] values) {
        this.values = values;
    }
    
    public Set(boolean infinite) {
        this.infinite = infinite;
    }
    
    public Set() {
        values = (E[]) new Comparable[0];
    }

    public E[] getValues() {
        return values;
    }

    public void setValues(E[] values) {
        this.values = values;
    }
}
