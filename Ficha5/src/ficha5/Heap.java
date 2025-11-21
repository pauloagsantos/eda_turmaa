/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha5;

/**
 *
 * @author IPT
 */
public abstract class Heap {
    
    protected Comparable array[];
    protected int count;
    
    public Heap(int maxSize) {
        array = new Comparable[maxSize];
        count = 0;
    }
    
    public boolean isEmpty() {
        return count == 0;
    } 
    
    public abstract void add(Comparable o);               
    public abstract boolean contains(Comparable o); 
    public abstract boolean remove(Comparable o); 
    
    public Comparable peek() {
        return isEmpty()?null:array[0];
    }
    
    protected int left(int index) {
        return 2*index+1;
    }
    
    protected int rigth(int index) {
        return 2*index+2;
    }
    
    protected int parent(int index) {
        return (index-1)/2;
    }
    
}
