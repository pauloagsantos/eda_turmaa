/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ficha3;

/**
 *
 * @author IPT
 */
public interface LinkedList {
    public boolean isEmpty(); 
    public void addFirst(Object o); 
    public void addLast(Object o); 
    public boolean contains(Object o); 
    public boolean remove(Object o); 
    public Object peekFirst(); 
    public Object peekLast();  
}
