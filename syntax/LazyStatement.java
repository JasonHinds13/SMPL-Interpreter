package syntax;

public class LazyStatement extends Statement {

    private Exp statement;

    public LazyStatement(Exp stat) {
        this.statement = stat;
    }

    public Exp getStatement() {
        return statement;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitLazyStatement(this, arg);
    }

}
