package smpl.values;

import java.util.ArrayList;

public class Vector extends Value<ArrayList<Value>>  {


    
	protected ArrayList<SMPLValue> vector;

	public Vector(ArrayList<SMPLValue> vals) {
	
		vector= vals;
	}

    public Vector() {
		this(new ArrayList<SMPLValue>());
	}

	public boolean isEmpty() {
		return null == vector;
	}

	public int size() {
		return vector.size();
	}
    
}
