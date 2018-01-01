package smpl.syntax;

import smpl.values.*;
import smpl.semantics.*;
import smpl.syntax.Pair;

public class CAR extends Statement {
    private Pair pair;

    public CAR(Pair p) {
        super();
        this.pair = p.getValue();
    }

    public Object returnFirst(){
        return pair.getFirst();
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitCAR(this, arg);
    }
}
