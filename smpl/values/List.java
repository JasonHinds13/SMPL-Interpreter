package smpl.values;

import java.util.ArrayList;

public class List extends Pair  {

	protected ArrayList<Value> vector;

	public List(ArrayList<Value> vals) {

		vector= vals;
	}

    public List() {
		this(new ArrayList<Value>());
	}

	public boolean isEmpty() {
		return null == vector;
	}

	public int size() {
		return vector.size();
	}

}
