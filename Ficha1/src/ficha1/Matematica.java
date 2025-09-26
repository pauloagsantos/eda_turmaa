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
    
    //5N+4 instruções
    //Complexidade temporal linear O(N)
    //num+f+i+return = 4 variáveis
    //Complexidade espacial constante S(1)
    public static int factorialI(int num) {
        int f=1;                      // 1
        for(int i=1; i <= num; i++)   // 1+N+1+2N
            f*=i;                     // 2N
        return f;                     // 1
    }
    
    //5N+2
    //Complexidade temporal linear O(N)
    //num+return= 2 variáveis * (N+1 da recursividade) = 2N+2
    //Complexidade espacial linear S(N)
    public static int factorialR(int num) {
        if (num==0)                        // 1*(N+1) = N+1
            return 1;                      // 1
        else
            return num*factorialR(num-1);  // (1+1+1+1)*N = 4N
    }
    
}
