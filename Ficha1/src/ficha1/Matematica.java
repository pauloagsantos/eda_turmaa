/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha1;

/**
 *
 * @author IPT
 */
public class Matematica {
    
    public static int factorialI(int num) {
        int f=1;
        for(int i=1; i <= num; i++)
            f*=i;
        return f;
    }
    
    public static int factorialR(int num) {
        if (num==0)
            return 1;
        else
            return num*factorialR(num-1); 
    }
    
}
