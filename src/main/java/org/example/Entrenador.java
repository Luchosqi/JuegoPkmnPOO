package org.example;

import java.util.List;

public class Entrenador {
    private String nombre;
    private List<Pokemon> equipo;
    public Entrenador(String nombre, List<Pokemon> equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", equipo=" + equipo +
                '}';
    }

    public List<Pokemon> mostrarEquipo() {
        for (Pokemon pokemon : equipo) {
            System.out.println(pokemon);
        }
        
        return equipo;
    }
}
