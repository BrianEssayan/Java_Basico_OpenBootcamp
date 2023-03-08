package com.example;

public class FuncionPrecio {
    public static void main(String[] args) {
        // llamada a la funcion con impresion de resultado
        System.out.println(precioIva(10.5d));
    }

    // Funcion que recibe un precio y le incluye el IVA
    static double precioIva(double precio){
        return precio * 1.21;
    }
}
