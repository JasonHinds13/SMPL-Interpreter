import smpl.values;

public class Value<V>
{
    public static final Value NO_VALUE = new Value <String> (NO_VALUE);
    protected V val;
    
    public Value(V val) {
        this.value = value;
    }

    public V getVal()
    {
        return value;
    }
}