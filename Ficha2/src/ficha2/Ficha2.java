/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha2;


/**
 *
 * @author IPT
 */
public class Ficha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("LimitedStack  :" + runXtimes(new LimitedStack(1000000),10));
        System.out.println("IlimitedStack :" + runXtimes(new IlimitedStack(),10));
        System.out.println("Java Stack    :" + runXtimes(new java.util.Stack(),10));
    
    }
    
    private static long runXtimes(Stack s, int n) {
        long sum=0;
        for(int i=0; i < n; i++) {
            long ini = System.nanoTime();
            for(int j=0; j<1000000; j++)
                s.push(Math.random());
            while(!s.isEmpty())
                s.pop();
            long fim = System.nanoTime();
            sum += fim-ini;
        }
        return sum/n;
    }
    
    private static long runXtimes(java.util.Stack s, int n) {
        long sum=0;
        for(int i=0; i < n; i++) {
            long ini = System.nanoTime();
            for(int j=0; j<1000000; j++)
                s.push(Math.random());
            while(!s.isEmpty())
                s.pop();
            long fim = System.nanoTime();
            sum += fim-ini;
        }
        return sum/n;
    }
    
}
