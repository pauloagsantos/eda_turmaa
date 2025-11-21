/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha5;

import java.util.Arrays;

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
    
    public void add(Comparable o) {
        array[count] = o;
        count = count + 1;
        reorganiza();    
    }   
    
    protected abstract void reorganiza();
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
    
    protected void troca(int i, int j) {
        Comparable aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    @Override
    public String toString() {
        return "Heap{" + "array=" + Arrays.asList(array) + ", count=" + count + '}';
    }
    
    
    
    
}
