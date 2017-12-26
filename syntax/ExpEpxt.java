package syntax;

public class ExpExpt extends Exp {

    Exp exp1, exp2;

    public ExpExpt(Exp e1, Exp e2) {
	exp1 = e1;
	exp2 = e2;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpPow(this, arg);
    }

    public String toString() {
	return exp1.toString() + " ^ " + exp2.toString();
    }
}
