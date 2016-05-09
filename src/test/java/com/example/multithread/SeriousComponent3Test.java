package com.example.multithread;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Funker on 21.08.2015.
 */
public class SeriousComponent3Test extends BaseTestListener {

    @Test
    public void testSad() {
        assertTrue(SeriousComponent.testSeriousness("SAD"));
    }

}

