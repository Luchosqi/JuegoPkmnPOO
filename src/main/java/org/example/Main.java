package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Para manejar excepciones no abuses de los throws, mejor usa try catch y gestiona
    // la excepcion dentro de una funcion sin la necesidad de eredar esas excepciones entre diferentes clases4
    //  No: public static void main(String[] args) throws CsvValidationException, IOException {
    public static void main(String[] args) {

        // Necesitaba ser estatico por que lo estamos llamando de forma global,
        // en vez de crear el objeto y utilizar el comportamiento
        GestorArchivo gestorArchivo = new GestorArchivo();
        List<Pokemon> pokemons = new ArrayList<>();

        List<String[]> lineas2 = gestorArchivo.crearLista();
        for (int i = 1; i < lineas2.size(); i++) {
            // Trata de no sobre explotar el main, crea funciones que cumplan funcionalidades especificas asi
            // puedes buscar errores de forma mas especifica y modificar de forma mas especifica
            Pokemon pokemon = crearObjetoPokemon(lineas2.get(i));
            pokemons.add(pokemon);
        }

        pokemons.forEach(System.out::println);
    }


    // Estas clases son privadas por que no se ocuparan en un lugar que no sea la clase main
    // y estaticas por que son autoctonas de la clase main que ya es  estatica
    private static Pokemon crearObjetoPokemon(String[] datos) {
        int numero = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        String tipo1 = datos[2];
        String tipo2 = datos[3].isEmpty() ? null : datos[3];
        int total = Integer.parseInt(datos[4]);
        int hp = Integer.parseInt(datos[5]);
        int ataque = Integer.parseInt(datos[6]);
        int defensa = Integer.parseInt(datos[7]);
        int velocidad = Integer.parseInt(datos[10]);
        int generacion = Integer.parseInt(datos[11]);
        boolean legendario = Boolean.parseBoolean(datos[12]);
        int vidacompletaHP = Integer.parseInt(datos[5]);

        return new Pokemon(numero, nombre, tipo1, tipo2, total, hp, ataque, defensa, velocidad, generacion, legendario, vidacompletaHP);
    }
}




