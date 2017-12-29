package smpl.values;

import java.util.ArrayList;

public class List extends Pair  {
    
	protected ArrayList<SMPLValue> vector;

	public List(ArrayList<SMPLValue> vals) {
	
		vector= vals;
	}

    public List() {
		this(new ArrayList<SMPLValue>());
	}

	public boolean isEmpty() {
		return null == vector;
	}

	public int size() {
		return vector.size();
	}
    
}
