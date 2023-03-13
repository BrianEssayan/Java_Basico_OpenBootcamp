package clases;

public class Coche {

    // Atributos
    String marca;
    String modelo;
    double cc;
    int velocidad;
    int puertas;

    // Constructores
    public Coche() {
    }

    public Coche(String marca, String modelo, double cc, int velocidad, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cc = cc;
        this.velocidad = velocidad;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", velocidad=" + velocidad +
                ", puertas=" + puertas +
                '}';
    }
}
