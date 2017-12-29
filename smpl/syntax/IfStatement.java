package smpl.syntax;

public class IfStatement extends Statement {

    private Exp condition;
    private Exp body;
    private Exp else;

    public IfStatement(Exp cond, Exp bod, Exp other) {
        this.condition = cond;
        this.body = bod;
        this.else = other;
    }

    public IfStatement(Exp cond, Exp bod) {
        this.condition = cond;
        this.body = bod;
        this.else = null;
    }

    public Exp getCond() {
        return condition;
    }

    public Exp getBody(){
        return body;
    }

    public Exp getElse(){
        return else;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitIfStatement(this, arg);
    }

}
