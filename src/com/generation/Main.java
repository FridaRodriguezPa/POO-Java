package com.generation;



public class Main {

    public static void main(String[] args) {

        //Objetos

        Perro lomitos = new Perro();
        lomitos.nombre = "Chems";
        lomitos.edad = 1;
        lomitos.raza = "mestizo";
        lomitos.tamanio = "wrande";
        lomitos.caracteristicas();
        lomitos.comer();

        System.out.println("------------------------");

        Perro lomito2 = new Perro();
        lomito2.nombre = "Firulais";
        lomito2.edad = 2;
        lomito2.raza = "pug";
        lomito2.tamanio = "chiquillo";
        lomito2.caracteristicas();
        lomito2.dormir();
    }
}
