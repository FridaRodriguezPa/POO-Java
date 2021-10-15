package com.generation;

//Clase
public class Perro {

    String nombre;
    String raza;
    int edad;
    String tamanio;
//Metodos
    public void caracteristicas(){
        System.out.println("Hola, mi nombre es " + this.nombre + " soy de raza " + this.raza + " tengo " + this.edad + " años. Soy de tamaño " + this.tamanio);
    }
    public void comer (){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("zzzzzzzz");
    }
    public void jugar(){
        System.out.println("Estoy jugando");
    }

}
