package Nivell_3.s1_01_nivell3ex1.modules;

public class NoticiaBasquet extends Noticia{

    private String competicion;
    private String club;

    public NoticiaBasquet(String titular, String competicion, String club) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
    }
    ///Metodo calcular precio
    public double calcularPrecio() {
        super.setPrecio(250);
        if (this.competicion.equals("euroliga")) {
            super.setPrecio(super.getPrecio() + 75);
        }
        if (this.club.equals("barça") || this.club.equals("madrid")) {
            super.setPrecio(super.getPrecio() + 75);
        }
        return super.getPrecio();
    }
    ///Metodo calcular puntuacion
    public int calcularPuntuacion() {
        super.setPrecio(4);
        if (this.competicion.equals("euroliga")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }
        else if (this.competicion.equals("acb")) {
            super.setPuntuacion(super.getPuntuacion() + 2);
        }
        else if (this.club.equals("barça") || this.club.equals("madrid")) {
            super.setPuntuacion(super.getPuntuacion() + 1);
        }
        return super.getPuntuacion();
    }
}
