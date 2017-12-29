package smpl.syntax;

public class PrintLn extends Statement {
    private Exp printstr;

    public PrintLn(Exp exp) {
        this.printstr = exp;
    }

    public Exp getPrintStr() {
        return printstr;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitPrintLn(this, arg);
    }

}
