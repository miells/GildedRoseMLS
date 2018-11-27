package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor{
    public void visit(AgedBrie a)
    {
        System.out.println("AgedBrie");
    }

    public void visit(Backstage b)
    {
        System.out.println("Backstage");
    }

    public void visit(Conjured c)
    {
        System.out.println("Conjured");
    }

    public void visit(DexterityVest d)
    {
        System.out.println("DexterityVest");
    }

    public void visit(Elixir e)
    {
        System.out.println("Elixir");
    }

    public void visit(Sulfuras s)
    {
        System.out.println("Sulfuras");
    }
}
