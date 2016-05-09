package com.example.multithread;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Funker on 21.08.2015.
 */
public class SeriousComponent1Test extends BaseTestListener {


    @Test
    public void testSad() {
        assertTrue(SeriousComponent.testSeriousness("SAD"), "message SAD");
    }

    @Test
    public void testSerious() {
        assertTrue(SeriousComponent.testSeriousness("SERIOUS"), "message SERIOUS");
    }

    @Test
    public void testCrazy() {
        assertTrue(SeriousComponent.testSeriousness("CRAZY"), "message CRAZY");
    }

    @Test
    public void testFunny() {
        assertFalse(SeriousComponent.testSeriousness("FUNNY"), "message FUNNY");
    }
}

