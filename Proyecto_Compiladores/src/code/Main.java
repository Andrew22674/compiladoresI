/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java_cup.runtime.Symbol;



/**
 *
 * @author Carlos Rivera
 */
public class Main {

    public static void main(String[] args) throws IOException, Exception {
        String ruta1 = "./src/code/Lexer.flex";
        String[] rutaS = {"-parser", "Sintax", "./src/code/Parser.cup"};
        generar(ruta1, rutaS);

        //compile("./src/code/test.txt");
    }

    public static void generar(String ruta1, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);

        java_cup.Main.main(rutaS);

        Path rutaSym = Paths.get("./src/code/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("./sym.java"),
                Paths.get("./src/code/sym.java")
        );

        Path rutaSin = Paths.get("./src/code/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("./Sintax.java"),
                Paths.get("./src/code/Sintax.java")
        );

    }
    
    public static void compile(String path){
        try {
			System.out.println("Compilando \"" + path + "\"...");
			Lexer scanner = new Lexer(new BufferedReader(new FileReader(
					path)));

			Sintax parser = new Sintax(scanner);
			Symbol s = parser.parse();
			
			if (s.toString().equals("#0"))
				System.out.println("Compilación exitosa");
			else
				System.out.println(s);
			
		} catch (Exception e) {
			System.err.println("Failed to compile \"" + path + "\":");
			System.err.println(e.getMessage());
		}
    }
}
