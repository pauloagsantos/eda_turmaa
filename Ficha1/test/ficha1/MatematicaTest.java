/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha1;

import java.math.BigInteger;
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
public class MatematicaTest {
    
    public MatematicaTest() {
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
     * Test of factorialI method, of class Matematica.
     */
    @Test
    public void testFactorialI() {
        System.out.println("factorialI");
        assertEquals(BigInteger.valueOf(1), Matematica.factorialI(0));
        assertEquals(BigInteger.valueOf(1), Matematica.factorialI(1));
        assertEquals(BigInteger.valueOf(2), Matematica.factorialI(2));
        assertEquals(BigInteger.valueOf(6), Matematica.factorialI(3));
        assertEquals(BigInteger.valueOf(24), Matematica.factorialI(4));
        assertEquals(BigInteger.valueOf(120), Matematica.factorialI(5));
    }

    /**
     * Test of factorialR method, of class Matematica.
     */
    @Test
    public void testFactorialR() {
        System.out.println("factorialR");
        assertEquals(BigInteger.valueOf(1), Matematica.factorialR(0));
        assertEquals(BigInteger.valueOf(1), Matematica.factorialR(1));
        assertEquals(BigInteger.valueOf(2), Matematica.factorialR(2));
        assertEquals(BigInteger.valueOf(6), Matematica.factorialR(3));
        assertEquals(BigInteger.valueOf(24), Matematica.factorialR(4));
        assertEquals(BigInteger.valueOf(120), Matematica.factorialR(5));
    }
    
}
