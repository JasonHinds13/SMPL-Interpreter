package smpl.syntax;

import smpl.semantics.*;

public class SMPLProgram extends Exp {
    StmtSequence seq;

    public SMPLProgram(StmtSequence s) {
	seq = s;
    }

    public StmtSequence getSeq() {
	return seq;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitSMPLProgram(this, arg);
    }

    public String toString() {
	return seq.toString();
    }
}
