package semantics;

public interface Visitor {

    // program
    public Object visitSMPLProgram(ArithProgram p,
				    Object arg)
	throws Exception;

    // statements
    public Object visitStatement(Statement exp, Object arg)
	throws Exception ;
    public Object visitStmtSequence(StmtSequence exp,
				    Object arg)
	throws Exception ;
    public Object visitStmtDefinition(StmtDefinition sd,
				      Object arg)
	throws Exception;
    public Object visitStmtLet(StmtLet let, Object arg)
	throws Exception;

  public Object visitCall(Call call, Object arg) throws Exception;
  public Object visitIfStatement(IfStatement ifs, Object arg)throws Exception;
  public Object visitLazyStatement(LazyStatement ls, Object arg) throws Exception;
  public Object visitPrint(Print print, Object arg) throws Exception;
  public Object visitPrintLn(PrintLn println, Object arg) throws Exception;
  public Object visitRead(Read read, Object arg) throws Exception;
  public Object visitReadInt(ReadInt readint, Object arg) throws Exception;


    // expressions
    public Object visitExpAdd(ExpAdd exp, Object arg)
	throws Exception ;
    public Object visitExpSub(ExpSub exp, Object arg)
	throws Exception;
    public Object visitExpMul(ExpMul exp, Object arg)
	throws Exception;
    public Object visitExpDiv(ExpDiv exp, Object arg)
	throws Exception;
  public Object visitExpPow(ExpExpt exp, Object arg)
throws Exception;
    public Object visitExpMod(ExpMod exp, Object arg)
	throws Exception;
    public Object visitExpLit(ExpLit exp, Object arg)
	throws Exception;
    public Object visitExpVar(ExpVar exp, Object arg)
	throws Exception;
}
