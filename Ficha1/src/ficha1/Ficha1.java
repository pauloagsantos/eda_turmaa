/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha1;

/**
 *
 * @author IPT
 */
public class Ficha1 {
    
    public static long runXtimes(int value, int x, boolean recursive) {
        long time=0;
        for(int i = 0; i < x; i++) {
            long ini = System.nanoTime();
            if (recursive)
                Matematica.factorialR(value);
            else
                Matematica.factorialI(value);
            long fim = System.nanoTime();
            time += fim-ini;
        }
        return time/x;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1000; i<=20000; i+=1000) {
            System.out.println(i+":"+runXtimes(i, 1, false)
                                +":"+runXtimes(i, 1, true));
        }
    }
    
}
