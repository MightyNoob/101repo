package jfactextractor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.TypeDeclaration;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;

/**
 *
 * @author Martin Leinberger
 */
public class JFactExtractor {

    private final static Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            CompilationUnit compilationUnit = JavaParser.parse(System.in);
            Fact fact = new Fact(compilationUnit);
            
            
            System.out.println(gson.toJson(fact));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
