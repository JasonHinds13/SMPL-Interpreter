package smpl.syntax;

import smpl.semantics.*;

public class ExpIsEqual extends Exp {

  Exp exp1, exp2;
    public ExpIsEqual(Exp e, Exp e2){
        this.exp1 = e;
        this.exp2 = e2;
    }

    public Exp getExpL() {
  return exp1;
    }

    public Exp getExpR() {
  return exp2;
    }
    public Boolean isEqual(){
        return exp1 == exp2;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpIsEqual(this, arg);
    }
}
