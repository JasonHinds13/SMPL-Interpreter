package smpl.syntax;

import smpl.semantics.*;
import java.util.ArrayList;

public class Procedure {

    ArrayList<String> params;
    StmtSequence body;

    public Procedure(ArrayList<String> params, StmtSequence bdy) {
        this.params = params;
        this.body = bdy;
    }

    public Procedure(ArrayList<String> params, Exp bdy) {
        this.params = params;
        this.body = new StmtSequence(new Statement(bdy));
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public StmtSequence getBody() {
        return body;
    }

    @Override
    public visit(Visitor v, Object arg) throws Exception {
        return v.visitProcExp(this, arg);
    }

    @Override
    public String toString() {
        return "proc: " + params.toString();
    }
}
