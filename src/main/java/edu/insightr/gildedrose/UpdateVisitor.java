package edu.insightr.gildedrose;

import gherkin.lexer.El;

public class UpdateVisitor implements IVisitor{
    public void visit(AgedBrie a)
    {
        a.setQuality(a.getQuality()+1);
        if(a.getQuality() > 50)
            a.setQuality(50);
        if(a.getQuality() < 0)
            a.setQuality(0);
    }

    public void visit(Backstage b)
    {
        if(b.getSellIn() <0)
        {
            b.setQuality(0);
        }
        else if(b.getSellIn() <=5)
        {
            b.setQuality(b.getQuality()+3);
        }
        else if(b.getSellIn() <= 10)
        {
            b.setQuality(b.getQuality()+2);
        }
        else b.setQuality(b.getQuality()+1);
        if(b.getQuality() < 0)
            b.setQuality(0);
        if(b.getQuality() > 50)
            b.setQuality(50);
    }

    public void visit(Conjured c)
    {
        if(c.getSellIn() < 0)
            c.setQuality(c.getQuality()-4);
        else
            c.setQuality(c.getQuality()-2);
        if(c.getQuality() < 0)
            c.setQuality(0);
        if(c.getQuality() > 50)
            c.setQuality(50);
    }

    public void visit(DexterityVest d)
    {
        if(d.getSellIn() < 0)
            d.setQuality(d.getQuality()-2);
        else
            d.setQuality(d.getQuality()-1);
        if(d.getQuality() < 0)
            d.setQuality(0);
        if(d.getQuality() > 50)
            d.setQuality(50);
    }

    public void visit(Elixir e)
    {
        if(e.getSellIn() < 0)
            e.setQuality(e.getQuality()-2);
        else
            e.setQuality(e.getQuality()-1);
        if(e.getQuality() < 0)
            e.setQuality(0);
        if(e.getQuality() > 50)
            e.setQuality(50);
    }

    public void visit(Sulfuras s)
    {
        s.setQuality(80);
    }
}
