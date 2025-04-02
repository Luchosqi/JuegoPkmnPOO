package org.example;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CsvValidationException, IOException {
        List<Pokemon> pokemons = new ArrayList<>();

        String ruta = "file/pkmn.csv";
        List<String[]> lineas2 = GestorArchivo.crearLista();
        for (int i = 1; i < lineas2.size(); i++) {
            int numero = Integer.parseInt(lineas2.get(i)[0]);
            String nombre = lineas2.get(i)[1];
            String tipo1 = lineas2.get(i)[2];
            String tipo2 = lineas2.get(i)[3].isEmpty() ? null : lineas2.get(i)[3];
            int total = Integer.parseInt(lineas2.get(i)[4]);
            int hp = Integer.parseInt(lineas2.get(i)[5]);
            int ataque = Integer.parseInt(lineas2.get(i)[6]);
            int defensa = Integer.parseInt(lineas2.get(i)[7]);
            int spAtk = Integer.parseInt(lineas2.get(i)[8]);
            int spDef = Integer.parseInt(lineas2.get(i)[9]);
            int velocidad = Integer.parseInt(lineas2.get(i)[10]);
            int generacion = Integer.parseInt(lineas2.get(i)[11]);
            boolean legendario = Boolean.parseBoolean(lineas2.get(i)[12]);
            int vidacompletaHP = Integer.parseInt(lineas2.get(i)[5]);
            Pokemon pokemon = new Pokemon(numero, nombre, tipo1, tipo2, hp, ataque, defensa, velocidad, vidacompletaHP);
            pokemons.add(pokemon);
            System.out.println(pokemon);

        }
    }
}




