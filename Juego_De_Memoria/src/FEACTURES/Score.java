package FEACTURES;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Score {
    static void escribir(String Dato1, String Dato2, String Dato3,String Dato4, String direccion) throws IOException {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try {
            archivo = new FileWriter(direccion, true);
            escritor = new PrintWriter(archivo);
            escritor.printf("%-8s %7s %9s %6s%n", Dato1, Dato2, Dato3, Dato4, "");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            archivo.close();
        }
    }
}
