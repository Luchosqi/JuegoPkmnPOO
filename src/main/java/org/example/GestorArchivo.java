package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivo {
    private final String PATH = "file/pkmn.csv";

    public  List<String[]> crearLista() {
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(PATH)).build();
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