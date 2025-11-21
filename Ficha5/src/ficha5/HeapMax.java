/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha5;

/**
 *
 * @author IPT
 */
public class HeapMax extends Heap {

    public HeapMax(int maxSize) {
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
                else if (o.compareTo(array[parent(inicio)])<0 &&
                         o.compareTo(array[inicio])>0)
                    numNodos = numNodos + 1;
                inicio = inicio +1;
            }
            if (numNodos == nodos)
                return false;
            nodos = nodos * 2;  
        }
        return false;
    }
    
    public int findIndex(Comparable o) {
        int inicio = 0;
        int nodos = 1;
        while (inicio < count) {
            inicio = nodos - 1;
            int fim = nodos + inicio;
            int numNodos = 0;
            while (inicio < count && inicio < fim) {
                if (o.equals(array[inicio]))
                    return inicio;
                else if (o.compareTo(array[parent(inicio)])<0 &&
                         o.compareTo(array[inicio])>0)
                    numNodos = numNodos + 1;
                inicio = inicio +1;
            }
            if (numNodos == nodos)
                return -1;
            nodos = nodos * 2;  
        }
        return -1;
    }

    @Override
    public boolean remove(Comparable o) {
        int index = findIndex(o);
        if (index < 0)
            return false;
        else {
            count = count - 1;
            array[index] = array[count];
            if (array[index].compareTo(array[parent(index)])>0)
                while (index > 0 && array[index].compareTo(array[parent(index)])>0) {
                    troca(index, parent(index));
                    index = parent(index);
                }
            else {
                while ( left(index) < count &&
                        (array[index].compareTo(array[left(index)])<0 ||
                         array[index].compareTo(array[rigth(index)])<0 ))
                    if (array[left(index)].compareTo(array[rigth(index)])>0) {
                        troca(left(index), index);
                        index = left(index);
                    } else {
                        troca(rigth(index), index);
                        index = rigth(index);
                    }
            }
            return true;
        }
    }

    @Override
    protected void reorganiza() {
        int i = count - 1;
        while (i > 0 && array[i].compareTo(array[parent(i)])>0) {
            troca(i, parent(i));
            i = parent(i);
        }
    }
    
}
