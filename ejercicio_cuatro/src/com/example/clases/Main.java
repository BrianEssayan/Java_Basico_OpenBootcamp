package com.example.clases;

import com.example.herencia.SmartPhone;
import com.example.herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        //Creacion objeto SmartWatch e impresion de datos
        SmartPhone telefono1 = new SmartPhone("Apple", "Iphone 14", 256, 4000, true, "Vodafone", 39393939);
        System.out.println("Marca: " + telefono1.marca + "\n" +
                "Modelo: " + telefono1.modelo + "\n" +
                "Espacio(GB): " + telefono1.espacio + "\n" +
                "Bateria(mah): " + telefono1.bateria + "\n" +
                "Sumergible: " + telefono1.sumergible + "\n" +
                "Compania: " + telefono1.compania + "\n" +
                "Telefono: " + telefono1.numeroTelefono);

        System.out.println("\n");

        //Creacion objeto SmartWatch e impresion de datos
        SmartWatch watch1 = new SmartWatch("Apple", "AppleWatch Series 8", 64, 1600, true, 2.4, false);
        System.out.println("Marca: " + watch1.marca + "\n" +
                "Modelo: " + watch1.modelo + "\n" +
                "Espacio(GB): " + watch1.espacio + "\n" +
                "Bateria(mah): " + watch1.bateria + "\n" +
                "Sumergible: " + watch1.sumergible + "\n" +
                "Pulgadas: " + watch1.pulgadas + "\n" +
                "Despertador: " + watch1.despertador);
    }
}
