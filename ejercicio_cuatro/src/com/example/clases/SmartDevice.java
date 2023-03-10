package com.example.clases;

// Clase padre
public class SmartDevice {

    // Atributos
    protected String marca;
    protected String modelo;
    protected int espacio;
    protected int bateria;
    protected boolean sumergible;

    // Constructor vacio y constructor con parametros
    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, int espacio, int bateria, boolean sumergible) {
        this.marca = marca;
        this.modelo = modelo;
        this.espacio = espacio;
        this.bateria = bateria;
        this.sumergible = sumergible;
    }
}
