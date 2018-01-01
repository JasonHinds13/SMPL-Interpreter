package smpl.syntax;

import smpl.semantics.*;

public class PairExp extends Exp {
    private Exp e,e2;

    public PairExp(Exp e, Exp e2) {
        this.e = e;
        this.e2 = e2;
    }


    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
        return v.visitPairExp(this, arg);
    }
}
