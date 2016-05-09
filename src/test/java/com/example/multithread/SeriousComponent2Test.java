package com.example.multithread;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Funker on 21.08.2015.
 */
public class SeriousComponent2Test extends BaseTestListener {

    @Test
    public void testSad() {
        assertTrue(SeriousComponent.testSeriousness("SAD"));
    }

    @Test
    public void testSerious() {
        assertTrue(SeriousComponent.testSeriousness("SERIOUS"));
    }

    @Test
    public void testCrazy() {
        assertTrue(SeriousComponent.testSeriousness("CRAZY"));
    }

    @Test
    public void testFunny() {
        assertTrue(!SeriousComponent.testSeriousness("FUNNY"));
    }
}

