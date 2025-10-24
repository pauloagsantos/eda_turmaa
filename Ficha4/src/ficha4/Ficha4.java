/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha4;

/**
 *
 * @author IPT
 */
public class Ficha4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long ini, end;
        int n = 1000000;
        
        ini = System.nanoTime();
        BinarySearchTree t = new BinarySearchTree();
        for(int i = 0; i < n;  ) {
            double r = Math.random();
            if (!t.contains(r)) {
                t.add(r);
                i++;
            }
        }
        end = System.nanoTime();
        System.out.println("Tree:" + (end-ini));
        
        ini = System.nanoTime();
        java.util.LinkedList l = new java.util.LinkedList();
        for(int i = 0; i < n;  ) {
            double r = Math.random();
            if (!l.contains(r)) {
                l.add(r);
                i++;
            }
        }
        end = System.nanoTime();
        System.out.println("List:" + (end-ini));
               
    }
    
}
