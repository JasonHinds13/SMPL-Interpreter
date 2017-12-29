package smpl.values;

import smpl.semantics.*;
import smpl.syntax.*;
import smpl.values.*;

import java.util.ArrayList;

public class Function {

    ArrayList<String> params;
    StmtSequence body;
    Context env;
    Exp arg;

    public Function(ArrayList<String> params, StmtSequence bdy, Context env) {
        this.params = params;
        this.body = bdy;
        this.env = env;
    }

    public Context getEnv() {
        return env;
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public StmtSequence getBody() {
        return body;
    }