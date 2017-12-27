package syntax;

public class ReadInt extends Statement {
    private Boolean readInt;

    public ReadInt(boolean b) {
        this.readInt = b;
    }


    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitReadInt(this, arg);
    }

    public Boolean getReadInt() {
        return readInt;
    }

}
