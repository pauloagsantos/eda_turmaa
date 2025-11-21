/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha5;

/**
 *
 * @author IPT
 */
public class Ficha5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeapMin h = new HeapMin(10);
        h.add(4);
        h.add(6);
        h.add(8);
        h.add(10);
        h.add(2);
        System.out.println(h);
        
        System.out.println(h.contains(2));
        System.out.println(h.contains(4));
        System.out.println(h.contains(3));
    }
    
}
