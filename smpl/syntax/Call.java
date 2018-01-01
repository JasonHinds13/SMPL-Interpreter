package smpl.syntax;

import smpl.values.*;
import smpl.semantics.*;

public class Call extends Statement {

    private Procedure proc;
    private List list;

    public Call(Procedure pro, List lis) {
        this.proc = pro;
        this.list = lis;
    }

    public Procedure getProc() {
        return proc;
    }

    public List getList(){
        return list;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitCall(this, arg);
    }

}
