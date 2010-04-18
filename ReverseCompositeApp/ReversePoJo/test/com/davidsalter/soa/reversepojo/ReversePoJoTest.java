/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.davidsalter.soa.reversepojo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class ReversePoJoTest {

    public ReversePoJoTest() {
    }

    /**
     * Test of reverseString method, of class ReversePoJo.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String input = "abcdefg";
        ReversePoJo instance = new ReversePoJo();
        String expResult = "gfedcba";
        String result = instance.reverseString(input);
        assertEquals(expResult, result);
    }

}