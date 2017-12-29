package smpl.syntax;

public class Read extends Statement {

    public Read() {
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitRead(this, arg);
    }

}
