package Nivell_3.s1_01_nivell3ex1.modules;

import java.util.ArrayList;

public class NoticiaTenis extends Noticia{


    private String tenista;

    public NoticiaTenis(String titular, String tenista) {
        super(titular);
        this.tenista = tenista;
    }

    ///Metodo calcular precio
    public double calcularPrecio() {
        super.setPrecio(150);
        if(tenista.equals("federer") || tenista.equals("nadal") || tenista.equals("Djokovic")) {
            super.setPrecio(super.getPrecio() + 100);
        }

        return super.getPrecio();
    }
    ///Metodo calcular puntuacion
    public int calcularPuntuacion() {
        super.setPuntuacion(4);
        if(tenista.equals("federer") || tenista.equals("nadal") || tenista.equals("djokovic")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }

        return super.getPuntuacion();
    }
}
