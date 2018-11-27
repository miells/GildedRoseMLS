package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    protected Item item;

    @Before
    public void setUp() throws Exception {
        item =  new Item("", 3, 80);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertFalse((item.getName() != null) || (item.getName() == ""));
    }

    @Test
    public void setName() {
    }

    @Test
    public void getSellIn() {
        if(item.getName().matches(".*Sulfuras.*"))
            assertTrue(item.getSellIn()== 0);
    }

    @Test
    public void setSellIn() {
    }

    @Test
    public void getQuality() {
        assertFalse(item.getQuality()<0);
        if(item.getName().matches(".*Sulfuras.*"))
            assertTrue(item.getQuality() == 80);
        else
            assertFalse(item.getQuality() > 50);
    }

    @Test
    public void setQuality() {
    }

}