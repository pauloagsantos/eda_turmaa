/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha6;

import java.util.Stack;

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
            root = add(root, node);    
    }
    
    private Node add(Node current, Node node) {
        if (node.data.compareTo(current.data)<0)
            if (current.left == null)
                current.left = node;
            else
                current.left = add(current.left, node);
        else if (current.right == null)
            current.right = node;
        else
            current.right = add(current.right, node);
        return balance(current);
    }
    
    private Node balance(Node nodo) {
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
        return nodo;
    }
    
    @Override
    public boolean remove(Comparable o) {
        Node nodeToRemove = root;
        Node parent = null;
        Stack<Node> pilha = new Stack();
        pilha.push(root);
        while (nodeToRemove != null && !nodeToRemove.data.equals(o)) {
            parent = nodeToRemove;
            if (o.compareTo(nodeToRemove.data)<0)
                nodeToRemove = nodeToRemove.left;
            else
                nodeToRemove = nodeToRemove.right;
            pilha.push(nodeToRemove);
        }
        if (nodeToRemove == null)
            return false;
        else {
            if (root.left == null && root.right == null) // árvore apenas com um elemento
                root = null;
            else if (root.data.equals(o) && root.left == null && root.right != null) 
                root = root.right;
            else if (root.data.equals(o) && root.left != null && root.right == null) 
                root = root.left;
            else if (nodeToRemove.left == null && nodeToRemove.right == null) // caso 1: Folha
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = null;
                else
                    parent.right = null;
            else if (nodeToRemove.left == null && nodeToRemove.right != null) // caso 2.1: Um descendente à direita
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = nodeToRemove.right;
                else
                    parent.right = nodeToRemove.right;
            else if (nodeToRemove.left != null && nodeToRemove.right == null) // caso 2.2: Um descendente à esquerda
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = nodeToRemove.left;
                else
                    parent.right = nodeToRemove.left;
            else { // caso 3: Dois descendentes
                Node majorNode = nodeToRemove.left;
                Node parentMajorNode = nodeToRemove;
                while (majorNode.right != null) {
                    parentMajorNode = majorNode;
                    majorNode = majorNode.right;
                }
                if (parentMajorNode == nodeToRemove)
                    parentMajorNode.left = majorNode.left;
                else
                    parentMajorNode.right = majorNode.left;
                nodeToRemove.data = majorNode.data;
            }
            while (!pilha.empty())
                balance( pilha.pop() );
            return true;
        }
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
