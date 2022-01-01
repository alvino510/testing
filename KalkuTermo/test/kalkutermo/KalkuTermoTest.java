/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkutermo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author LENOVO
 */
public class KalkuTermoTest {
    
    public KalkuTermoTest() {
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
    public void testCelsiusR() {
        System.out.println("Testing Celsius to Reamur");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 16;
        CelsiusR celsiusr = new CelsiusR(20);
        double result = instance.calculateSuhu(celsiusr);
        assertEquals(expResult, result,0.5);
    }
   @Test
    public void testCelsiusF() {
        System.out.println("Testing Celsius to Farenheit");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 68;
        CelsiusF celsiusf = new CelsiusF(20);
        double result = instance.calculateSuhu(celsiusf);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testCelsiusK() {
        System.out.println("Testing Celsius to Kelvin");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 293.15;
        CelsiusK celsiusk = new CelsiusK(20);
        double result = instance.calculateSuhu(celsiusk);
        assertEquals(expResult, result,0.5);
    }
    
    @Test
    public void testReamurC() {
        System.out.println("Testing Reamur to Celsius");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 37.5;
        ReamurC reamurc = new ReamurC(30);
        double result = instance.calculateSuhu(reamurc);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testReamurF() {
        System.out.println("Testing Reamur to Farenheit");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 99.5;
        ReamurF reamurf = new ReamurF(30);
        double result = instance.calculateSuhu(reamurf);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testReamurK() {
        System.out.println("Testing Reamur to Kelvin");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 310.65;
        ReamurK reamurk = new ReamurK(30);
        double result = instance.calculateSuhu(reamurk);
        assertEquals(expResult, result,0.5);
    }
    
    @Test
    public void testFarenheitC() {
        System.out.println("Testing Farenheit to Celsius");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 32.22;
        FarenheitC farenheitc = new FarenheitC(90);
        double result = instance.calculateSuhu(farenheitc);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testFarenheitR() {
        System.out.println("Testing Farenheit to Reamur");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 25.77;
        FarenheitR farenheitr = new FarenheitR(90);
        double result = instance.calculateSuhu(farenheitr);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testFarenheitK() {
        System.out.println("Testing Farenheit to Kelvin");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 305.37;
        FarenheitK farenheitk = new FarenheitK(90);
        double result = instance.calculateSuhu(farenheitk);
        assertEquals(expResult, result,0.5);
    }
    
    @Test
    public void testKelvinC() {
        System.out.println("Testing Kelvin to Celsius");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 226.85;
        KelvinC kelvinc = new KelvinC(500);
        double result = instance.calculateSuhu(kelvinc);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testKelvinR() {
        System.out.println("Testing Kelvin to Reamur");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 181.48;
        KelvinR kelvinr = new KelvinR(500);
        double result = instance.calculateSuhu(kelvinr);
        assertEquals(expResult, result,0.5);
    }
    @Test
    public void testKelvinF() {
        System.out.println("Testing Kelvin to Farenheit");
        KalkuTermo instance = new KalkuTermo();
        double expResult = 440.33;
        KelvinF kelvinf = new KelvinF(500);
        double result = instance.calculateSuhu(kelvinf);
        assertEquals(expResult, result,0.5);
    }
}
