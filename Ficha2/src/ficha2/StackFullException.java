/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha2;

/**
 *
 * @author IPT
 */
public class StackFullException extends RuntimeException {
    public StackFullException() {
        super("Pilha Cheia!!!");
    }
}
