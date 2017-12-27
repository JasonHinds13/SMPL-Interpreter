package syntax;

public class Read extends Statement {
    private Boolean readStr;

    public Read(boolean b) {
        this.readStr = b;
    }


    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitRead(this, arg);
    }

    public Boolean getReadStr() {
        return readStr;
    }

}
