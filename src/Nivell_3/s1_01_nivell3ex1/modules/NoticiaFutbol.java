package Nivell_3.s1_01_nivell3ex1.modules;

public class NoticiaFutbol extends Noticia{

    private String competicion;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicion, String club, String jugador) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;

    }
    ///Metodo calcular precio
    public double calcularPrecio() {
        super.setPrecio(300);
        if (this.competicion.equals("liga de campeones")) {
            super.setPrecio(super.getPrecio() + 100);
        }
        if (this.club.equals("barça") || this.club.equals("madrid")) {
            super.setPrecio(super.getPrecio() + 100);
        }
        if (this.jugador.equals("ferran torres") || this.jugador.equals("benzema")) {
            super.setPrecio(super.getPrecio() + 50);
        }
        return super.getPrecio();
    }
    ///Metodo calcular puntuacion
    public int calcularPuntuacion() {
        super.setPuntuacion(5);
        if (this.competicion.equals("liga de campeones")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }
        else if(this.competicion.equals("liga")){
            super.setPuntuacion(super.getPuntuacion() + 2);
        }
        if (this.club.equals("barça") || this.club.equals("madrid")) {
            super.setPuntuacion(super.getPuntuacion() + 1);
        }
        if (this.jugador.equals("ferran torres") || this.jugador.equals("benzema")) {
            super.setPuntuacion(super.getPuntuacion() + 1);
        }
        return super.getPuntuacion();
    }

}
