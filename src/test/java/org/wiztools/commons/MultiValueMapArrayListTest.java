/*
 * Copyright WizTools.org
 * Licensed under the Apache License, Version 2.0:
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package org.wiztools.commons;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subwiz
 */
public class MultiValueMapArrayListTest {

    public MultiValueMapArrayListTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMultiValues(){
        // To test that same key-value duplication is allowed:
        MultiValueMap<String, String> instance = new MultiValueMapArrayList<String, String>();
        instance.put("a", "a");
        instance.put("a", "a");
        instance.put("a", "b");
        assertEquals(instance.values().size(), 3);
    }

}