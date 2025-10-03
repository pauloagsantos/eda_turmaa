/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha2;

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
public class TesteStack {
    
    public TesteStack() {
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

    @Test
    public void testStacks() {
        testar(new LimitedStack(10));
        testar(new IlimitedStack());
    }
    
    private void testar(Stack s) {
        assertEquals(true, s.isEmpty());
        assertEquals(null, s.pop());
        assertEquals(null, s.peek());
        s.push("ola");
        assertEquals(false, s.isEmpty());
        assertEquals("ola", s.peek());
        assertEquals("ola", s.pop());
        assertEquals(true, s.isEmpty());
        s.push("ola");
        s.push("mundo");
        assertEquals(false, s.isEmpty());
        assertEquals("mundo", s.peek());
        assertEquals("mundo", s.pop());
        assertEquals("ola", s.peek());
        assertEquals("ola", s.pop());
        assertEquals(true, s.isEmpty());
        for(int i = 0; i < 10; i++)
            s.push(i);
        assertEquals(false, s.isEmpty());
        if (s instanceof LimitedStack) {
            try {
                s.push(10);
                fail("A pilha devia estar cheia");
            } catch (StackFullException e) {
                // se entrar aqui está tudo normal
            }
        }
        for(int i = 9; i >= 0; i--) {
            assertEquals(i, s.peek());
            assertEquals(i, s.pop());
        }
        assertEquals(true, s.isEmpty());
    }
}
