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
        BinarySearchTree t = new BinarySearchTree();
        t.add(5);
        t.add(3);
        t.add(2);
        t.add(4);
        t.add(7);
        t.add(6);
        t.add(8);
        t.show();
        System.out.println(t.contains(5));
        System.out.println(t.contains(3));
        System.out.println(t.contains(2));
        System.out.println(t.contains(10));
        
        System.out.println("------------------");
        t.remove(2);
        t.show();
        System.out.println("------------------");
        t.remove(3);
        t.show();
        System.out.println("------------------");
        t.remove(5);
        t.show();
        System.out.println("------------------");
        t.remove(4);
        t.show();
        
        System.out.println(t.findMin());
        System.out.println(t.findMax());
    }
    
}
