package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivo {

    public static List<String[]> crearLista() {
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader("file/pkmn.csv")).build();
            String[] nextLine;
            List<String[]> lineas = new ArrayList();
            while ((nextLine = reader.readNext()) != null) {
                lineas.add(nextLine);
            }
            return lineas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}