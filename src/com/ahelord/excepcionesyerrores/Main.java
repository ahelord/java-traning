package com.ahelord.excepcionesyerrores;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(com.ahelord.excepcionesyerrores.Main.class.getName());
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "Info logger");
        logger.info("info con funcion");
        logger.fine("fine no se muestra");
        // en este caso solo se intentara utilizar el parametro 1 si el nivel de log es correcto
        logger.log(Level.INFO, "Product id {0} is selected", 12);
        Error myError = new Error();
        //myError.doThings();

        try {
            myError.doThings();
        } catch (NullPointerException | ArithmeticException e) {
            logger.log(Level.INFO, "Info logger", e);
        } catch (IOException e) {
            logger.log(Level.INFO, "Info logger", e);

        }
        // AutoClosure
        // es posible por que BufferedReader y PrintWriter
        // implementan la interfaz reader : public abstract class Reader implements Readable, Closeable
        try (BufferedReader in = new BufferedReader(new FileReader("some.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("other.txt"))
        ) {
            String text = in.readLine();
            out.println(text);
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "File not found", e);

        }

    }

}
