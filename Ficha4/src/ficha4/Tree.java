/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ficha4;

/**
 *
 * @author IPT
 */
public interface Tree {
    public boolean isEmpty(); 
    public void add(Comparable o); 
    public boolean contains(Comparable o); 
    public boolean remove(Comparable o); 
    public Comparable findMin(); 
    public Comparable findMax(); 
}
