package Nivell_3.s1_01_nivell3ex1.modules;

public abstract class Noticia {

    private String titular;
    private String texto;
    private int puntuacion;
    private double precio;

    //Construcotor
    public Noticia(String titular) {
        this.titular = titular;
        this.texto = "";
        this.puntuacion = 0;
        this.precio = 0;
    }

    //Getters
    public String getTitular() {
        return this.titular;
    }

    public String getTexto() {
        return this.texto;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public double getPrecio() {
        return this.precio;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodos propios

    public abstract int calcularPuntuacion();

    public abstract double calcularPrecio();
}
