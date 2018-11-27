package edu.insightr.gildedrose;

public class Sulfuras extends Item{
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public Sulfuras(){super();}

    public void accept(IVisitor v)
    {
        v.visit(this);
    }
}
