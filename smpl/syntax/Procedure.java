package smpl.syntax;

import java.util.ArrayList;

public class Procedure {

    ArrayList<String> params;
    SMPLStmtSequence body;

    public Procedure(ArrayList<String> params, SMPLStmtSequence bdy) {
        this.params = params;
        this.body = bdy;
    }

    public Procedure(ArrayList<String> params, SMPLExp bdy) {
        this.params = params;
        this.body = new SMPLStmtSequence(new SMPLStatement(bdy));
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public SMPLStmtSequence getBody() {
        return body;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitProcExp(this, arg);
    }

    @Override
    public String toString() {
        return "proc: " + params.toString();
    }
}
