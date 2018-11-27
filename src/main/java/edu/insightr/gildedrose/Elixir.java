package edu.insightr.gildedrose;

public class Elixir extends Item{
    public Elixir(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public Elixir(){super();}

    public void accept(IVisitor v)
    {
        v.visit(this);
    }
}
