package syntax;

public class Print extends Statement {
    private Exp printstr;

    public Print(Exp exp) {
        this.printstr = exp;
    }

    public Exp getPrintStr() {
        return printstr;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitPrint(this, arg);
    }

}
