package smpl.syntax;

import smpl.semantics.*;

public class ReadInt extends Statement {

    public ReadInt() {
    }


    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitReadInt(this, arg);
    }

}
