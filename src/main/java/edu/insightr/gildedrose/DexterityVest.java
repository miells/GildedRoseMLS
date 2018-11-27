package edu.insightr.gildedrose;

public class DexterityVest extends Item {
    public DexterityVest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor v)
    {
        v.visit(this);
    }
}
