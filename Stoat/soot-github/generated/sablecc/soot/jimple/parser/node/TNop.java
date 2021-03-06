/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TNop extends Token
{
    public TNop()
    {
        super.setText("nop");
    }

    public TNop(int line, int pos)
    {
        super.setText("nop");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNop(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNop(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNop text.");
    }
}
