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
        // (a+bi)/(c+di) = (a+bi)*(c-di) / (c+di)*(c-di)
        Complexo num = multiplicar(c1, conjugado(c2));
        Complexo den = multiplicar(c2, conjugado(c2));
        return new Complexo(num.r/den.r, num.i/den.r);
    }
    
    public static Complexo conjugado(Complexo c) { 
        // devolve um número complexo com o conjugado de c
        // conjugado(a+bi) = a-bi
        return new Complexo(c.r, -1*c.i);
    } 
    
    public String toString() { 
        // devolve uma string no formato a+bi ou a-bi ou -a+bi ou -a-bi 
        // consoante os termos reais e imaginários sejam positivos ou 
        // negativos
        StringBuilder sb = new StringBuilder();
        sb.append(r);
        if (i>=0)
            sb.append("+");
        sb.append(i);
        sb.append("i");
        return sb.toString();
    } 

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complexo other = (Complexo) obj;
        if (Double.doubleToLongBits(this.r) != Double.doubleToLongBits(other.r)) {
            return false;
        }
        return Double.doubleToLongBits(this.i) == Double.doubleToLongBits(other.i);
    }
    
    public Object clone() { 
        // devolve um novo número complexo com o mesmo valor 
        return new Complexo(r,i);
    }
}
