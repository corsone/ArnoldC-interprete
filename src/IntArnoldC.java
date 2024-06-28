import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class IntArnoldC extends ArnoldCBaseVisitor<Value>{
    private final Conf conf;

    public IntArnoldC(Conf conf){
        this.conf = conf;

        conf.getStack().push(new HashMap<>());
    }

    @Override
    public ComValue visitProg(ArnoldCParser.ProgContext ctx) {
        if(!ctx.meth_decl().isEmpty())
            for (int i=0; i<ctx.meth_decl().size(); i++){
                visit(ctx.meth_decl(i));
            }

        if (ctx.stmt() != null)
            return (ComValue) visit(ctx.stmt());
        else
            return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitVoidMethod(ArnoldCParser.VoidMethodContext ctx) {
        String funcName = ctx.ID(0).getText();
        if(conf.funcContains(funcName)){
            System.err.println("Function " + funcName + " has been already declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        ArrayList<String> args = new ArrayList<>();
        if(ctx.ARGS() != null){
            for (int i = 1; i <= ctx.ARGS().size(); i++) {
                String arg = ctx.ID(i).getText();
                if (!args.contains(arg)) {
                    args.add(arg);
                }else {
                    System.err.println("Duplicate parameter: " + arg);
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }
            }
        }

        conf.funcUpdate(funcName, new FuncValue(args, ctx.stmt(), null));
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitNonVoidMethod(ArnoldCParser.NonVoidMethodContext ctx) {
        String funcName = ctx.ID(0).getText();
        if(conf.funcContains(funcName)){
            System.err.println("Function " + funcName + " has been already declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }


        ArrayList<String> args = new ArrayList<>();
        if(ctx.ARGS() != null){
            for (int i = 1; i <= ctx.ARGS().size(); i++) {
                String arg = ctx.ID(i).getText();
                if (!args.contains(arg)) {
                    args.add(arg);
                }else {
                    System.err.println("Duplicate parameter: " + arg);
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }
            }
        }

        conf.funcUpdate(funcName, new FuncValue(args, ctx.stmt(), ctx.exp()));

        return ComValue.INSTANCE;
    }



    @Override
    public ComValue visitMeth_call(ArnoldCParser.Meth_callContext ctx) {
        if(ctx.ASSIGN_FROM_METHOD()  == null){
            String funcName = ctx.ID(0).getText();
            if (!conf.funcContains(funcName)){
                System.err.println("Function " + funcName + " used but never declared");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }

            ArrayList<String> paramDec = conf.funcGet(funcName).getParameters();
            if (paramDec.size() != ctx.exp().size()){
                System.err.println("Function " + funcName + " expected " + conf.funcGet(funcName).getParameters().size() + " parameters but got " + ctx.exp().size() + " parameters.");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }

            conf.getStack().push(new HashMap<>());

            for (int i = 0; i < paramDec.size(); i++)
                conf.getStack().peek().put(paramDec.get(i), (NatValue) visit(ctx.exp().get(i)));

            visit(conf.funcGet(funcName).getBody());

            conf.getStack().pop();
        }else{
            String funcName = ctx.ID(1).getText();
            if (!conf.funcContains(funcName)){
                System.err.println("Function " + funcName + " used but never declared");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }

            ArrayList<String> paramDec = conf.funcGet(funcName).getParameters();
            if (paramDec.size() != ctx.exp().size()){
                System.err.println("Function " + funcName + " expected " + conf.funcGet(funcName).getParameters().size() + " parameters but got " + ctx.exp().size() + " parameters.");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }


            List<NatValue> old = new ArrayList<>();
            for (int i = 0; i < ctx.exp().size(); i++)
                old.add((NatValue) visit(ctx.exp().get(i)));

            conf.getStack().push(new HashMap<>());

            for (int i = 0; i < paramDec.size(); i++)
                conf.getStack().peek().put(paramDec.get(i), old.get(i));

            visit(conf.funcGet(funcName).getBody());

            NatValue result = (NatValue) visit(conf.funcGet(ctx.ID(1).getText()).getResult());

            conf.getStack().pop();

            conf.getStack().peek().put(ctx.ID(0).getText(), result);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitVar_decl(ArnoldCParser.Var_declContext ctx) {
        String id = ctx.ID().getText();
        NatValue v = (NatValue) visit(ctx.exp());

        if(conf.getStack().peek().containsKey(id)){
            System.err.println("Variable " + id + " already declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        conf.getStack().peek().put(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitVar_assign(ArnoldCParser.Var_assignContext ctx) {
        String id = ctx.ID().getText();
        NatValue v = (NatValue) visit(ctx.exp());

        if(!conf.getStack().peek().containsKey(id)){
            System.err.println("Variable " + id + " used but never declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        conf.setCurrent(v.getInteger());

        for (int i=0; i<ctx.ops().size(); i++){
            visit(ctx.ops(i));
        }

        conf.getStack().peek().put(id, new NatValue(conf.getCurrent()));

        conf.setCurrent(0);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitPrintid(ArnoldCParser.PrintidContext ctx) {
        String id = ctx.ID().getText();


        if(!conf.getStack().peek().containsKey(id)){
            System.err.println("Variable " + id + " used but never declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        System.out.println(conf.getStack().peek().get(id));

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitPrintstring(ArnoldCParser.PrintstringContext ctx) {
        String s = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);

        System.out.println(s);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitCond(ArnoldCParser.CondContext ctx) {
        NatValue condition = (NatValue) visit(ctx.exp());

        if(condition.getInteger() > 0){
            return (ComValue) visit(ctx.stmt(0));
        }

        if (!(ctx.stmt(1) == null)) {
            return (ComValue) visit(ctx.stmt(1));
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitWhile(ArnoldCParser.WhileContext ctx) {
        while (((NatValue) visit(ctx.exp())).getInteger() > 0){
            visit(ctx.stmt());
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitStmt_concat(ArnoldCParser.Stmt_concatContext ctx) {
        visit(ctx.stmt(0));
        visit(ctx.stmt(1));

        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(ArnoldCParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public NatValue visitBool(ArnoldCParser.BoolContext ctx) {
        return switch (ctx.op.getType()){
            case ArnoldCParser.TRUE -> new NatValue(1);
            case ArnoldCParser.FALSE -> new NatValue(0);
            default -> null;
        };
    }

    @Override
    public NatValue visitId(ArnoldCParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!conf.getStack().peek().containsKey(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }


        return conf.getStack().peek().get(id);
    }

    @Override
    public ComValue visitDivMulMod(ArnoldCParser.DivMulModContext ctx) {
        int left = conf.getCurrent();
        NatValue right = (NatValue) visit(ctx.exp());

        switch (ctx.op.getType()){
            case ArnoldCParser.DIV:
                conf.setCurrent(left / right.getInteger());
                break;
            case ArnoldCParser.MUL:
                conf.setCurrent(left * right.getInteger());
                break;
            case ArnoldCParser.MOD:
                conf.setCurrent(left % right.getInteger());
                break;
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitPlusMinus(ArnoldCParser.PlusMinusContext ctx) {
        int left = conf.getCurrent();
        NatValue right = (NatValue) visit(ctx.exp());

        switch (ctx.op.getType()){
            case ArnoldCParser.PLUS:
                conf.setCurrent(left + right.getInteger());
                break;
            case ArnoldCParser.MINUS:
                conf.setCurrent(left - right.getInteger());
                break;
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitGt(ArnoldCParser.GtContext ctx) {
        int left = conf.getCurrent();
        NatValue right = (NatValue) visit(ctx.exp());

        if (left > right.getInteger()) {
            conf.setCurrent(1);
        } else {
            conf.setCurrent(0);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitEq(ArnoldCParser.EqContext ctx) {
        int left = conf.getCurrent();
        NatValue right = (NatValue) visit(ctx.exp());

        if (right.getInteger().equals(left)) {
            conf.setCurrent(1);
        } else {
            conf.setCurrent(0);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitLogic(ArnoldCParser.LogicContext ctx) {
        int left = conf.getCurrent();
        NatValue right = (NatValue) visit(ctx.exp());


        switch (ctx.op.getType()){
            case ArnoldCParser.AND:
                if (left != 0 && right.getInteger() != 0) {
                    conf.setCurrent(1);
                } else {
                    conf.setCurrent(0);
                }
                break;
            case ArnoldCParser.OR:
                if (left != 0 || right.getInteger() != 0) {
                    conf.setCurrent(1);
                } else {
                    conf.setCurrent(0);
                }
                break;
        }

        return ComValue.INSTANCE;
    }
}
