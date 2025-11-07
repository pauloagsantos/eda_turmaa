/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha6;

/**
 *
 * @author IPT
 */
public class Ficha6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ini, end;
        
        ini = System.nanoTime();
        BinarySearchTree t1 = new BinarySearchTree();
        for(int i = 0; i <10000; i++)
            t1.add(i);
        end = System.nanoTime();
        System.out.println("BST:" + (end-ini));
        
        ini = System.nanoTime();
        AVLTree t2 = new AVLTree();
        for(int i = 0; i <1000000; i++)
            t2.add(i);
        end = System.nanoTime();
        System.out.println("AVL:" + (end-ini));
        
    }
    
}
