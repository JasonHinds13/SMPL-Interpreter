package smpl.syntax;

import smpl.semantics.*;

public class ExpIsEqv extends Exp {

  Exp exp1, exp2;
    public ExpIsEqv(Exp e, Exp e2){
        this.exp1 = e;
        this.exp2 = e2;
    }

    public Exp getExpL() {
  return exp1;
    }

    public Exp getExpR() {
  return exp2;
    }
    public Boolean isEquivalent(){
        return exp1.equals(exp2);
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpIsEqv(this, arg);
    }
}
