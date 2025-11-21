/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha5;

/**
 *
 * @author IPT
 */
public class HeapMin extends Heap {

    public HeapMin(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean contains(Comparable o) {
        int inicio = 0;
        int nodos = 1;
        while (inicio < count) {
            inicio = nodos - 1;
            int fim = nodos + inicio;
            int numNodos = 0;
            while (inicio < count && inicio < fim) {
                if (o.equals(array[inicio]))
                    return true;
                else if (o.compareTo(array[parent(inicio)])>0 &&
                         o.compareTo(array[inicio])<0)
                    numNodos = numNodos + 1;
                inicio = inicio +1;
            }
            if (numNodos == nodos)
                return false;
            nodos = nodos * 2;  
        }
        return false;
    }

    @Override
    public boolean remove(Comparable o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void reorganiza() {
        int i = count - 1;
        while (i > 0 && array[i].compareTo(array[parent(i)])<0) {
            troca(i, parent(i));
            i = parent(i);
        }
    }
    
}
