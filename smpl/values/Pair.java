package smpl.values;

import java.util.ArrayList;

public class Pair extends Value<ArrayList<Value>>  {

	protected Value[] pair = new Value[2];;

	public Pair(Value v1, Value v2) {
		pair[0] = v1;
		pair[1] = v2;
	}

    public Vector() {
		this(null, null);
	}

	public void setValue1(Value value)
	{
		pair[0] = value;
	}

	public void setValue2(Value value)
	{
		pair[1] = value;
	}

	public Value getValue1()
	{
		return pair[0];
	}

	public Value getValue2()
	{
		return pair[1];
	}
    
}
