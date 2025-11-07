/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IPT
 */
public class AVLTreeTest {
    
    public AVLTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class BinarySearchTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AVLTree t = new AVLTree();
        assertEquals(true, t.isEmpty());
        t.add(1);
        assertEquals(false, t.isEmpty());
        t.remove(1);
        assertEquals(true, t.isEmpty());
    }

    /**
     * Test of add method, of class BinarySearchTree.
     */
    @Test
    public void testAddAndContains() {
        System.out.println("add and contains");
        AVLTree t = new AVLTree();
        t.add(5);
        assertEquals(true, t.contains(5));
        t.add(3);
        assertEquals(true, t.contains(3));
        t.add(2);
        assertEquals(true, t.contains(2));
        t.add(4);
        assertEquals(true, t.contains(4));
        t.add(7);
        assertEquals(true, t.contains(7));
        t.add(6);
        assertEquals(true, t.contains(6));
        t.add(8);
        assertEquals(true, t.contains(8));
        
        assertEquals(false, t.contains(10));
    }

    
    /**
     * Test of remove method, of class BinarySearchTree.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        AVLTree t = new AVLTree();
        t.add(5);
        t.add(3);
        t.add(2);
        t.add(4);
        t.add(7);
        t.add(6);
        t.add(8);
        assertEquals(true, t.remove(2));
        assertEquals(true, t.remove(3));
        assertEquals(false, t.remove(10));
        assertEquals(true, t.remove(7));
        assertEquals(true, t.remove(6));
        assertEquals(true, t.remove(5));
        assertEquals(true, t.remove(4));
        assertEquals(true, t.remove(8));     
    }

    /**
     * Test of findMin method, of class BinarySearchTree.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        AVLTree t = new AVLTree();
        assertEquals(null, t.findMin());
        t.add(5);
        t.add(3);
        t.add(2);
        t.add(4);
        t.add(7);
        t.add(6);
        t.add(8);
        assertEquals(2, t.findMin());
    }

    /**
     * Test of findMax method, of class BinarySearchTree.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        AVLTree t = new AVLTree();
        assertEquals(null, t.findMin());
        t.add(5);
        t.add(3);
        t.add(2);
        t.add(4);
        t.add(7);
        t.add(6);
        t.add(8);
        assertEquals(8, t.findMax());
    }
    
}
