package smpl.syntax;

import smpl.values.*;
import smpl.semantics.*;

public class ExpVar extends Exp {

    String var;

    public ExpVar(String id) {
	var = id;
    }

    public int eval(Environment env) throws Exception {
	return env.get(var);
    }

    public String getVar(){
      return var;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpVar(this, arg);
    }

    public String toString() {
	return var;
    }
}
