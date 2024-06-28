import java.util.ArrayList;
import java.util.Objects;

public class FuncValue extends Value {
    private final ArrayList<String> parameters;
    private final ArnoldCParser.StmtContext body;
    private final ArnoldCParser.ExpContext result;

    public FuncValue(ArrayList<String> parameters, ArnoldCParser.StmtContext body, ArnoldCParser.ExpContext result) {
        this.parameters = parameters;
        this.body = body;
        this.result = result;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public ArnoldCParser.StmtContext getBody() {
        return body;
    }

    public ArnoldCParser.ExpContext getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FuncValue funcValue)) return false;
        return Objects.equals(parameters, funcValue.parameters) && Objects.equals(body, funcValue.body) && Objects.equals(result, funcValue.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, body, result);
    }
}
