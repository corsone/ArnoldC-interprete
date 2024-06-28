import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        ArnoldCLexer lexer = new ArnoldCLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArnoldCParser parser = new ArnoldCParser(tokens);

        ParseTree tree = parser.prog();
        IntArnoldC interprete = new IntArnoldC(new Conf());
        interprete.visit(tree);
    }
}
