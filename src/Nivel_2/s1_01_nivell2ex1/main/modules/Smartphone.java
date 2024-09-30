package Nivel_2.s1_01_nivell2ex1.main.modules;

public class Smartphone extends Telefon implements Camara, Rellotge{

    //Constructor
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    //Metodes propis

    public String fotografiar() {
        return "S'esta fent una foto";
    }

    public String alarma() {
        return "Esta sonant l'alarma";
    }

}
