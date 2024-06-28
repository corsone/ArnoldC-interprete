import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Conf {
    //private final Map<String, NatValue> map = new HashMap<>();
    private final Map<String, FuncValue> functions = new HashMap<>();
    private final Stack<Map<String, NatValue>> stack = new Stack<>();
    private static int current = 0;


    public Stack<Map<String, NatValue>> getStack() {
        return stack;
    }

    public FuncValue funcGet(String id) {
        return functions.get(id);
    }

    public void funcUpdate(String id, FuncValue v) {
        functions.put(id, v);
    }

    public boolean funcContains(String id){
        return functions.containsKey(id);
    }

    public int getCurrent(){
        return current;
    }

    public void setCurrent(int newCurrent){
        current = newCurrent;
    }
}
