package smpl.values;

public class Value<v>
{
    public static final Value NO_VALUE = null;
    protected V val;

    public Value(V val) {
        this.val = val;
    }

    public V getVal()
    {
        return val;
    }
}
