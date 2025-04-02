package org.example;

public class Enfermera {
    public int curarPokemon(Pokemon pokemon) {
        int vidacompletaHP=pokemon.getHp();
        pokemon.setVidacompletaHP(vidacompletaHP);
        System.out.println("El pokemon recupero su hp, su vida actual es: "+ vidacompletaHP+".");
        return vidacompletaHP;
    }
}
