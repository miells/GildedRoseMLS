package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {
    protected Inventory inv;
    protected Item[] ancienneListeDesItems;

    @Before
    public void setUp() throws Exception {
        inv = new Inventory();
        ancienneListeDesItems = inv.getItems();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void printInventory() {
    }

    @Test
    public void testUpdateQualityWhenSellInFinished() {
        inv.updateQuality();
        Item[] items = inv.getItems();
        for (int i=0; i<items.length; i++)
        {
            if(ancienneListeDesItems[i].getSellIn() == 0)
                assertEquals(ancienneListeDesItems[i].getQuality()-2,items[i].getQuality());
        }
    }

    @Test
    public void main() {
    }
}