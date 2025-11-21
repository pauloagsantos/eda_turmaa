/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha5;

import java.util.Random;

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
        int size = 1000000;
      
        HeapMax h = new HeapMax(size);
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            h.add(r.nextInt(size));
        }
        
        while(!h.isEmpty()) {
            System.out.print(h.peek()+" ");
            h.remove(h.peek());
        }
        
        System.out.println("");
    }
    
}
