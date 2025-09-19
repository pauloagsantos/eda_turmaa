/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha0;

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
public class ComplexoTest {
    
    public ComplexoTest() {
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
     * Test of getParteReal method, of class Complexo.
     */
    @Test
    public void testGetParteReal() {
        System.out.println("getParteReal");
        Complexo c = new Complexo();
        assertEquals(0, c.getParteReal(),0);
        c = new Complexo(1,1);
        assertEquals(1, c.getParteReal(),0);
        c = new Complexo(-1,-2);
        assertEquals(-1, c.getParteReal(),0);
    }

    /**
     * Test of getParteImaginaria method, of class Complexo.
     */
    @Test
    public void testGetParteImaginaria() {
        System.out.println("getParteImaginaria");
        Complexo c = new Complexo();
        assertEquals(0, c.getParteImaginaria(),0);
        c = new Complexo(1,1);
        assertEquals(1, c.getParteImaginaria(),0);
        c = new Complexo(-1,-2);
        assertEquals(-2, c.getParteImaginaria(),0);
    }

    /**
     * Test of somar method, of class Complexo.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        Complexo c1 = new Complexo(1,2);
        Complexo c2 = new Complexo(1,2);
        Complexo r = Complexo.somar(c1, c2);
        assertEquals(new Complexo(2,4), r);
        c1 = new Complexo(1,2);
        c2 = new Complexo(-1,2);
        r = Complexo.somar(c1, c2);
        assertEquals(new Complexo(0,4), r);
        c1 = new Complexo(1,2);
        c2 = new Complexo(1,-2);
        r = Complexo.somar(c1, c2);
        assertEquals(new Complexo(2,0), r);
    }

    /**
     * Test of subtrair method, of class Complexo.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        Complexo c1 = new Complexo(1,2);
        Complexo c2 = new Complexo(1,2);
        Complexo r = Complexo.subtrair(c1, c2);
        assertEquals(new Complexo(0,0), r);
        c1 = new Complexo(1,2);
        c2 = new Complexo(-1,2);
        r = Complexo.subtrair(c1, c2);
        assertEquals(new Complexo(2,0), r);
        c1 = new Complexo(1,2);
        c2 = new Complexo(1,-2);
        r = Complexo.subtrair(c1, c2);
        assertEquals(new Complexo(0,4), r);
    }

    /**
     * Test of multiplicar method, of class Complexo.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Complexo c1 = new Complexo(1,2);
        Complexo c2 = new Complexo(1,2);
        Complexo r = Complexo.multiplicar(c1, c2);
        assertEquals(new Complexo(-3,4), r);
    }

    /**
     * Test of dividir method, of class Complexo.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Complexo c1 = new Complexo(1,2);
        Complexo c2 = new Complexo(1,2);
        Complexo r = Complexo.dividir(c1, c2);
        assertEquals(new Complexo(1,0), r);
    }

    /**
     * Test of conjugado method, of class Complexo.
     */
    @Test
    public void testConjugado() {
        System.out.println("conjugado");
        Complexo c = new Complexo(1,2);
        assertEquals(new Complexo(1,-2), Complexo.conjugado(c));
    }

    /**
     * Test of toString method, of class Complexo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("1.0+2.0i", new Complexo(1,2).toString());
        assertEquals("-1.0+2.0i", new Complexo(-1,2).toString());
        assertEquals("-1.0-2.0i", new Complexo(-1,-2).toString());
        assertEquals("1.0-2.0i", new Complexo(1,-2).toString());
    }

    /**
     * Test of clone method, of class Complexo.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Complexo c = new Complexo(1,2);
        assertEquals(c, c.clone());
    }
    
}
