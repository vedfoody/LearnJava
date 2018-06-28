/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jeremy
 */
public class ArraySumNGTest {

    public ArraySumNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of sum method, of class ArraySum.
     */
//    @Test
    public void testSum_001() {
        int[] a = {3, 2, 0, 5, 2};
        int n = 32052;
        boolean expResult = true;
        boolean result = ArraySum.sum(a, n);
        assertEquals(result, expResult);
    }

    /**
     * Test of sum method, of class ArraySum.
     */
//    @Test
    public void testSum_002() {
        int[] a = {3, 2, 0, 5, 2};
        int n = 2052;
        boolean expResult = false;
        boolean result = ArraySum.sum(a, n);
        assertEquals(result, expResult);
    }

    @Test
    public void testSum_003() {
        int[] a = {5, 2};
        int n = 32052;
        boolean expResult = false;
        boolean result = ArraySum.sum(a, n);
        assertEquals(result, expResult);
    }

    @Test
    public void testSum_004() {
        int[] a = {};
        int n = 32052;
        boolean expResult = false;
        boolean result = ArraySum.sum(a, n);
        assertEquals(result, expResult);
    }

    @Test
    public void testSum_005() {
        int[] a = {3, 3};
        int n = 0;
        boolean expResult = false;
        boolean result = ArraySum.sum(a, n);
        assertEquals(result, expResult);
    }

    @Test
    public void testSum_006() {
        int[] a = {0};
        int n = 0;
        boolean expResult = true;
        boolean result = ArraySum.sum(a, n);
        assertEquals(result, expResult);
    }
}
