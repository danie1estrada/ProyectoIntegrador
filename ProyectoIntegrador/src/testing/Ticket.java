package testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ticket {

    static File archivo;
    static FileWriter escribir;


    public static void Escribir(String[] producto) throws IOException {
        //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
        File archivo = new File("Ticket.txt");

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        FileWriter escribir = new FileWriter(archivo);
        for (String producto1 : producto) {
            escribir.write(producto1 + "\n");
        }
        escribir.close();
    }

    public static void main(String[] arg) throws IOException {

        Escribir(new String[]{"marca",
             "chocolate",
            "vacaciones",
            "ya me quiero morir"});

    }

}
