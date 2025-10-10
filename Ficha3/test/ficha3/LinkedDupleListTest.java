/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha3;

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
public class LinkedDupleListTest {
    
    public LinkedDupleListTest() {
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
     * Test of isEmpty method, of class LinkedDupleList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedDupleList l = new LinkedDupleList();
        assertEquals(true, l.isEmpty());
        l.addFirst(1);
        assertEquals(false, l.isEmpty());
        l.remove(1);
        assertEquals(true, l.isEmpty());
    }

    /**
     * Test of addFirst method, of class LinkedDupleList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        LinkedDupleList l = new LinkedDupleList();
        l.addFirst(1);
        assertEquals(1, l.peekFirst());
        assertEquals(true, l.contains(1));
        l.addFirst(2);
        assertEquals(2, l.peekFirst());
        assertEquals(true, l.contains(2));
    }

    /**
     * Test of addLast method, of class LinkedDupleList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        LinkedDupleList l = new LinkedDupleList();
        l.addLast(1);
        assertEquals(1, l.peekLast());
        assertEquals(true, l.contains(1));
        l.addLast(2);
        assertEquals(2, l.peekLast());
        assertEquals(true, l.contains(2));
    }

    /**
     * Test of contains method, of class LinkedDupleList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        LinkedDupleList l = new LinkedDupleList();
        assertEquals(false, l.contains(1));
        l.addLast(1);
        assertEquals(true, l.contains(1));
        assertEquals(false, l.contains(2));
        assertEquals(false, l.contains(3));  
        l.addLast(2);
        assertEquals(true, l.contains(1));
        assertEquals(true, l.contains(2));
        assertEquals(false, l.contains(3));  
        l.addLast(3);
        assertEquals(true, l.contains(1));
        assertEquals(true, l.contains(2));
        assertEquals(true, l.contains(3));  
    }

    /**
     * Test of remove method, of class LinkedDupleList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        LinkedDupleList l = new LinkedDupleList();
        assertEquals(false, l.remove(1));
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        assertEquals(true, l.remove(2));
        assertEquals(false, l.contains(2));
        assertEquals(true, l.remove(1));
        assertEquals(false, l.contains(1));
        assertEquals(true, l.remove(3));
        assertEquals(false, l.contains(3));
    }

    /**
     * Test of peekFirst method, of class LinkedDupleList.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        LinkedDupleList l = new LinkedDupleList();
        assertEquals(null, l.peekFirst());
        l.addLast(1);
        assertEquals(1, l.peekFirst());
        l.addFirst(2);
        assertEquals(2, l.peekFirst());
        l.remove(2);
        assertEquals(1, l.peekFirst());
    }

    /**
     * Test of peekLast method, of class LinkedDupleList.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        LinkedDupleList l = new LinkedDupleList();
        assertEquals(null, l.peekLast());
        l.addLast(1);
        assertEquals(1, l.peekLast());
        l.addLast(2);
        assertEquals(2, l.peekLast());
        l.remove(2);
        assertEquals(1, l.peekLast()); 
    }
    
    @Test
    public void testes() {
        LinkedDupleList l = new LinkedDupleList();
        assertEquals("null", l.toString());
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);
        assertEquals("5 4 3 2 1", l.toString());
        l.remove(4);
        l.remove(2);
        assertEquals("5 3 1", l.toString());
        l.remove(5);
        l.remove(1);
        assertEquals("3", l.toString());
        
        
    }
    
    
}
