package com.example.herencia;

import com.example.clases.SmartDevice;

// Clase hija
public class SmartPhone extends SmartDevice {

    // Atributos
    public String compania;
    public int numeroTelefono;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, int espacio, int bateria, boolean sumergible, String compania, int numeroTelefono) {
        super(marca, modelo, espacio, bateria, sumergible);
        this.compania = compania;
        this.numeroTelefono = numeroTelefono;
    }
}
