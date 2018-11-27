package edu.insightr.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public AgedBrie(){super();}

    public void accept(IVisitor v)
    {
        v.visit(this);
    }
}
