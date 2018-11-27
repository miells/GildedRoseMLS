package edu.insightr.gildedrose;

public interface IVisitor {
    void visit(AgedBrie a);
    void visit(Backstage b);
    void visit(Conjured c);
    void visit(DexterityVest d);
    void visit(Elixir e);
    void visit(Sulfuras s);
}
