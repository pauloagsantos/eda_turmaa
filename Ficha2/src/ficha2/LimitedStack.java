/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha2;

/**
 *
 * @author IPT
 */
public class LimitedStack implements Stack {
    
    private final Object array[];
    private int top;
    
    public LimitedStack(int maxSize) {
        array = new Object[maxSize];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(Object item) {
        if (top == array.length-1)
            throw new StackFullException();
        top++;
        array[top] = item;
    }

    @Override
    public Object pop() {
        if (isEmpty())
            return null;
        return array[top--];
    }

    @Override
    public Object peek() {
        if (isEmpty())
            return null;
        return array[top];    
    }
    
}
