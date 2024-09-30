package Nivell_3.s1_01_nivell3ex1.modules;

public class NoticiaF1 extends Noticia{

    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }
    ///Metodo calcular precio
    public double calcularPrecio() {
        super.setPrecio(100);
        if (this.escuderia.equals("ferrari") || this.escuderia.equals("mercedes")) {
            super.setPrecio(super.getPrecio() + 50);
        }
        return super.getPrecio();
    }
    ///Metodo calcular puntuacion
    public int calcularPuntuacion() {
        super.setPuntuacion(4);
        if (this.escuderia.equals("ferrari") || this.escuderia.equals("mercedes")) {
            super.setPuntuacion(super.getPuntuacion() +2);
        }
        return super.getPuntuacion();
    }
}
