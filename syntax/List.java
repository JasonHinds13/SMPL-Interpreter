package syntax;

import java.util.ArrayList;

public class List extends Exp {

  ArrayList exps;

  public List(){
    exps = new ArrayList();
  }

  public List(ArrayList mem) {
    this.exps = mem;
  }

  public ArrayList getList(){
    return exps;
  }

    public Object visit(Visitor v, Object arg) throws Exception
    {
	     return v.visitList(this, arg);
    }

  public String toString() {
    return "";
  }
}
