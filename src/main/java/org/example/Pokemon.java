package org.example;
public class Pokemon {
    private int numero;
    private String nombre;
    private String tipo1;
    private String tipo2;
    private int total;
    private int hp;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int generacion;
    private boolean esLegendario;
    private int vidacompletaHP;


    @Override
    public String toString() {
        return "Pokemon{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", tipo1='" + tipo1 + '\'' +
                ", tipo2='" + tipo2 + '\'' +
                ", total=" + total +
                ", hp=" + hp +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                ", generacion=" + generacion +
                ", esLegendario=" + esLegendario +
                ", vidacompletaHP=" + vidacompletaHP +
                '}';
    }

    public Pokemon(int numero, String nombre, String tipo1, String tipo2, int total, int hp, int ataque, int defensa, int velocidad, int generacion, boolean esLegendario,int vidacompletaHP) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.total = total;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.generacion = generacion;
        this.esLegendario = esLegendario;
        this.vidacompletaHP = vidacompletaHP;
    }

    public int getHp() {
        return hp;
    }

    public void setVidacompletaHP(int vidacompletaHP) {
        this.vidacompletaHP = vidacompletaHP;
    }

    public int realizarAtq(Pokemon pokemon) {
     int atqPkmnRetador = pokemon.ataque;
     return atqPkmnRetador;
    }

    public int recibirDanio(Pokemon pokemon, int atqPkmnRetador) {
        pokemon.vidacompletaHP=vidacompletaHP-atqPkmnRetador;
        int dañoRecibido=vidacompletaHP;
        System.out.println("El pokemon "+pokemon.nombre+" recibio " + dañoRecibido+ " de daño, su vida restante es: "+ pokemon.vidacompletaHP);
        return dañoRecibido;
    }

}
