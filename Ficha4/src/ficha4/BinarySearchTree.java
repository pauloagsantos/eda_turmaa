/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha4;

/**
 *
 * @author IPT
 */
public class BinarySearchTree implements Tree {
    
    private Node root;
    
    public BinarySearchTree() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void add(Comparable o) {
        Node node = new Node();
        node.data = o;
        node.left = null;
        node.right = null;
        if (root == null)
            root = node;
        else
            add(root, node);    
    }
    
    public void add(Node current, Node node) {
        if (node.data.compareTo(current.data)<0)
            if (current.left == null)
                current.left = node;
            else
                add(current.left, node);
        else if (current.right == null)
            current.right = node;
        else
            add(current.right, node);        
    }

    @Override
    public boolean contains(Comparable o) {
        return contains(root, o);
    }
    
    private boolean contains(Node current, Comparable o) {
        if (current == null)
            return false;
        else if (current.data.equals(o))
            return true;
        else if (o.compareTo(current.data)<0)
            return contains(current.left, o);
        else
            return contains(current.right, o);       
    }

    @Override
    public boolean remove(Comparable o) {
        Node nodeToRemove = find(o);
        if (nodeToRemove == null)
            return false;
        else {
            Node parent = findParent(o);
            if (root.left == null && root.right == null) // apenas um elemento
                root = null;
            else if (root.data.equals(o) && root.left == null && root.right != null)
                root = root.right;
            else if (root.data.equals(o) && root.left != null && root.right == null)
                root = root.left;
            else if (nodeToRemove.left == null && nodeToRemove.right == null) // caso 1: folha
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = null;
                else
                    parent.right = null;
            else if (nodeToRemove.left == null && nodeToRemove.right != null) // caso 2.1: apenas um descendente à direita
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = nodeToRemove.right;
                else
                    parent.right = nodeToRemove.right;
            else if (nodeToRemove.left != null && nodeToRemove.right == null) // caso 2.2: apenas um descendente à esquerda
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = nodeToRemove.left;
                else
                    parent.right = nodeToRemove.left;
            else { // caso 3: dois descendentes
                Node majorNode = nodeToRemove.left;
                while (majorNode.right != null)
                    majorNode = majorNode.right;
                Node parentMajorNode = findParent(majorNode.data);
                if (parentMajorNode == nodeToRemove)
                    parentMajorNode.left = majorNode.left;
                else
                    parentMajorNode.right = majorNode.left;
                nodeToRemove.data = majorNode.data;
            }
            return true;
        }
    }
    
    private Node findParent(Comparable o) {
        return findParent(root, o);
    }
    
    private Node findParent(Node current, Comparable o) {
        if (o.equals(current.data))
            return null;
        else {
            if (o.compareTo(current.data)<0)
                if (current.left == null)
                    return null;
                else if (current.left.data.equals(o))
                    return current;
                else
                    return findParent(current.left, o);
            else if (current.right == null)
                return null;
            else if (current.right.data.equals(o))
                return current;
            else
                return findParent(current.right, o);
        }
    }
    
    public Node find(Comparable o) {
        return find(root, o);
    }
    
    private Node find(Node current, Comparable o) {
        if (current == null)
            return  null;
        else if (current.data.equals(o))
            return current;
        else if (o.compareTo(current.data)<0)
            return find(current.left, o);
        else
            return find(current.right, o);       
    }

    @Override
    public Comparable findMin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Comparable findMax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void show() { 
        show(root, 0, 0); 
    }
    
    private void show(Node current, int level, int dir) { 
        if (current!=null) { 
            show(current.right, level+1, 1); 
            for(int i=0; i < level; i++) 
                System.out.print("   "); 
            if (dir > 0) System.out.print("/"); 
            if (dir < 0) System.out.print("\\"); 
            System.out.println(current.data); 
            show(current.left, level+1, -1); 
        } 
    } 
    
    private class Node {
        Comparable data;
        Node left;
        Node right;
    }
    
}
