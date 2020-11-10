
package Compilador;
import java.io.File;
/**
 *
 * @author Henrr
 */
public class JFlex {
   public static void main(String[] args) throws Exception {
        try{
           generarLexer();
        }catch(Exception e){
           throw new Exception("Error al generar Archivo Lexer");
       }
    }
    
    
    
    public static void generarLexer() throws Exception{
        // Ruta del archivo donde se encuentra el archivo lex.flex
        String[] ruta = {"C:\\Users\\Henrr\\Documents\\NetBeansProjects\\Compilador\\src\\Compilador\\lex.flex"};
        try {  
            jflex.Main.generate(ruta);
        }catch(Exception e){
            throw new Exception("Error al crear  Archivo Lexer.java ");
        }
    }


    
}
