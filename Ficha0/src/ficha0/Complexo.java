/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha0;

/**
 *
 * @author IPT
 */
public class Complexo {
    
    private double r, i;
    
    public Complexo() { 
        // cria o seguinte número complexo:  0+0i 
        this(0,0);
    } 
    
    public Complexo(double a, double b) { 
        // cria o seguinte número complexo: a+bi 
        this.r = a;
        this.i = b;
    } 
    
    public double getParteReal() { 
        // devolve a parte real do complexo 
        return this.r;
    } 
 
    public double getParteImaginaria() { 
    // devolve a parte imaginaria do complexo 
        return this.i;
    } 
    
    public static Complexo somar(Complexo c1, Complexo c2) { 
        // devolve um número complexo com a soma de c1 e c2 
        //(a+bi)+(c+di) = (a+c)+(b+d)i
        double r = c1.r+c2.r;
        double i = c1.i+c2.i;
        return new Complexo(r,i);
    }
    
    public static Complexo subtrair(Complexo c1, Complexo c2) { 
        // devolve um número complexo com a subtracção de c1 e c2 
        //(a+bi)-(c+di) = (a-c)+(b-d)i
        double r = c1.r-c2.r;
        double i = c1.i-c2.i;
        return new Complexo(r,i);
    } 
  
    public static Complexo multiplicar(Complexo c1, Complexo c2) { 
        // devolve um número complexo com a multiplicação de c1 e c2 
        //(a+bi)*(c+di) = ac+adi+bci-bd = (ac-bd)+(ad+bc)i
        double a = c1.r;
        double b = c1.i;
        double c = c2.r;
        double d = c2.i;
        
        double r = a*c-b*d;
        double i = a*d+b*c;
        return new Complexo(r,i);
    } 
 public static Complexo dividir(Complexo c1, Complexo c2) { 
  // devolve um número complexo com a divisão de c1 e c2 
          } 
 public static Complexo conjugado(Complexo c) { 
  // devolve um número complexo com o conjugado de c 
          } 
 public String toString() { 
  // devolve uma string no formato a+bi ou a-bi ou -a+bi ou -a-bi 
      // consoante os termos reais e imaginários sejam positivos ou 
  // negativos 
 } 
 public boolean equals(Object o) { 
  // devolve true ou false consoante o complexo seja igual ou 
  // diferente a o 
 } 
 public Object clone() { 
  // devolve um novo número complexo com o mesmo valor 
 }
}
