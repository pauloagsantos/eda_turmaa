/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha6;

/**
 *
 * @author IPT
 */
public class AVLTree extends BinarySearchTree {
    
    
    @Override
    public void add(Comparable o) {
        NodeAVL node = new NodeAVL();
        node.data = o;
        node.height = 1;
        node.left = null;
        node.right = null;
        if (root == null)
            root = node;
        else
            add(root, node);    
    }
    
    private void add(Node current, Node node) {
        if (node.data.compareTo(current.data)<0)
            if (current.left == null)
                current.left = node;
            else
                add(current.left, node);
        else if (current.right == null)
            current.right = node;
        else
            add(current.right, node);
        balance(current);
    }
    
    private void balance(Node nodo) {
        ((NodeAVL)nodo).height = Math.max( height(nodo.left), height(nodo.right) ) + 1;
        if (factor(nodo) > 1)
            if (factor(nodo.left) >= 0)
                nodo = rightRotation(nodo);
            else
                nodo = doubleRightRotation(nodo);
        else if (factor(nodo) < -1)
            if (factor(nodo.right) <= 0)
                nodo = leftRotation(nodo);
            else
                nodo = doubleLeftRotation(nodo);
    }

    
    private int factor(Node nodo) {
        return height(nodo.left) - height(nodo.right);
    }
    
    private int height(Node nodo) {
        return nodo==null?0:((NodeAVL)nodo).height;
    }
    
    private Node rightRotation(Node k2) {
        Node k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        ((NodeAVL)k2).height = Math.max(height(k2.left), height(k2.right) ) + 1;
        ((NodeAVL)k1).height = Math.max(height(k1.left), height(k2) ) + 1;
        return k1;
    }
    
    private Node leftRotation(Node k1) {
        Node k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        ((NodeAVL)k1).height = Math.max( height(k1.left), height(k1.right) ) + 1;
        ((NodeAVL)k2).height = Math.max( height(k2.right), height(k1) ) + 1;
        return k2;
    }
    
    private Node doubleRightRotation(Node k3) {
        k3.left = leftRotation(k3.left);
        return rightRotation(k3);
    }
    
    private Node doubleLeftRotation(Node k1) {
        k1.right = rightRotation(k1.right);
        return leftRotation(k1);
    }
    
    private class NodeAVL extends Node {
        int height;
    }
    
}
