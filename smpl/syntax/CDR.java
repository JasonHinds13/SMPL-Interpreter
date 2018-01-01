package smpl.syntax;

import smpl.values.*;
import smpl.semantics.*;
import smpl.syntax.Pair;

public class CDR extends Statement {
    private Pair pair;

    public CDR(Pair p) {
        super();
        this.pair = p.getValue();
    }

    public Object returnSecond(){
        return pair.getSecond();
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitCDR(this, arg);
    }
}
