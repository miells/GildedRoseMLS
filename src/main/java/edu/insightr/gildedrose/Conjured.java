package edu.insightr.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor v)
    {
        v.visit(this);
    }
}
