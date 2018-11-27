package edu.insightr.gildedrose;

public class Backstage extends Item{
    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public Backstage(){super();}

    public void accept(IVisitor v)
    {
        v.visit(this);
    }
}
