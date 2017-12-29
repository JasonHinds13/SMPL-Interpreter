package smpl.syntax;

import syntax.Pair;

public class IsPair extends Statement {
    private Pair pair;

    public IsPair(Pair p) {
        pair = p;
    }

    public IsPair getPair() {
        return pair;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitIsPair(this, arg);
    }
}
