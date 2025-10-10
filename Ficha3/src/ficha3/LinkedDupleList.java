/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha3;

/**
 *
 * @author IPT
 */
public class LinkedDupleList implements LinkedList {
    
    private Item head;
    private Item tail;
    
    public LinkedDupleList() {
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        item.previous = null;
        if (head == null)
            head = tail = item;
        else {
            item.next = head; 
            head.previous = item;
            head = item;
        }
    }

    @Override
    public void addLast(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        item.previous = null;
        if (head == null)
            head = tail = item;
        else {
            tail.next = item;
            item.previous = tail;
            tail = item;
        }    
    }

    @Override
    public boolean contains(Object o) {
        Item i = head;
        while (i != null && !i.data.equals(o) )
            i = i.next;
        return i != null;   
    }

    @Override
    public boolean remove(Object o) {
        if (head == null)  // Situação 1
            return false; // lista vazia, sai
        else {
            if (head.data.equals(o)) { // o elemento a apagar esta no inicio
                if (head == tail) // Situação 2 lista com um elemento
                    head = tail = null;
                else { // Situação 3
                    head = head.next;
                    head.previous = null;
                }
                return true;
            }
            Item i = head.next;
            while (i != null && !i.data.equals(o) )
                i = i.next;
            if (i == tail) { //Situação 4
                tail = tail.previous;
                tail.next = null;
                return true;
            } else   // Situação 5
                 if (i!=null) {
                     i.previous.next = i.next;
                     i.next.previous = i.previous;
                     return true;
                 }
            return false; // Situação 6
        }
    }

    @Override
    public Object peekFirst() {
        if (isEmpty())
            return null;
        return head.data;
    }

    @Override
    public Object peekLast() {
        if (isEmpty())
            return null;
        return tail.data;    
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isEmpty())
            sb.append("null");
        else {
            Item i = head;
            while(i!=null) {
                sb.append(i.data);
                sb.append(" ");
                i = i.next;
            }
        }
        return sb.toString().trim();
    }
    
    private class Item {
        Object data;
        Item next;
        Item previous;
    }
    
}
