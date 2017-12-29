package syntax;

import syntax.Pair;

public class isPair extends Statement {
    private Pair pair;

    public isPair(Pair p) {
        pair = p;
    }

    public isPair getPair() {
        return pair;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitisPair(this, arg);
    }
}
