package com.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("...oratay oay oresmay ![]", PigLatin.pigIt("t...ora o mores ![]"));
    }
}