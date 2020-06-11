/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ttibe
 */
public class StringsExerciseBTest {
    
    public StringsExerciseBTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of tripleIt method, of class StringsExerciseB.
     */
    @Test
    public void testTripleIt() {
        System.out.println("tripleIt");
        String theString = "";
        String expResult = "";
        String result = StringsExerciseB.tripleIt(theString);
        assertEquals(expResult, result);
    }
    @Test
    public void testTripleItLlama() {
        System.out.println("tripleIt");
        String theString = "Llama";
        String expResult = "llamaLLAMAllama";
        String result = StringsExerciseB.tripleIt(theString);
        assertEquals(expResult, result);
    }
    @Test
    public void testTripleItHa() {
        System.out.println("tripleIt");
        String theString = "ha";
        String expResult = "haHAha";
        String result = StringsExerciseB.tripleIt(theString);
        assertEquals(expResult, result);
    }
    @Test
    public void testTripleIthaBeetlejuice() {
        System.out.println("tripleIt");
        String theString = "Beetlejuice";
        String expResult = "beetlejuiceBEETLEJUICEbeetlejuice";
        String result = StringsExerciseB.tripleIt(theString);
        assertEquals(expResult, result);
    }
    
}
