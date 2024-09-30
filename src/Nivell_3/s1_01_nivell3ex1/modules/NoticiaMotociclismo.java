package Nivell_3.s1_01_nivell3ex1.modules;

public class NoticiaMotociclismo extends Noticia{

    private String equipo;

    public NoticiaMotociclismo(String titular, String equipo) {
        super(titular);
        this.equipo = equipo;
    }
    ///Metodo calcular precio
    public double calcularPrecio() {
        super.setPrecio(100);
        if (this.equipo.equals("honda") || this.equipo.equals("yamaha")) {
            super.setPrecio(super.getPrecio() + 50);
        }
        return super.getPrecio();
    }
    ///Metodo calcular puntuacion
    public int calcularPuntuacion() {
        super.setPuntuacion(3);
        if (this.equipo.equals("honda") || this.equipo.equals("yamaha")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }
        return super.getPuntuacion();
    }
}
