package com.example.herencia;

import com.example.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    public double pulgadas;
    public boolean despertador;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String modelo, int espacio, int bateria, boolean sumergible, double pulgadas, boolean despertador) {
        super(marca, modelo, espacio, bateria, sumergible);
        this.pulgadas = pulgadas;
        this.despertador = despertador;
    }
}
