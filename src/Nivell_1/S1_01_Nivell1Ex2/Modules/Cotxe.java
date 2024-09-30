package Nivell_1.S1_01_Nivell1Ex2.Modules;

public class Cotxe {

    private static String model; //static fa que la mateixa variable sigui utilitzada per tots els objectes de la class
    private static final String marca = "Nissan"; //static final, es igual que static pero en constant, mai es pot modificar
    private final int potencia;					  // i s'ha de declarar directament

    public Cotxe(String model, int potencia) {
        Cotxe.model = model; // ens deixa inicialitzarla al constructor pero al ser static sempre sera la mateixa
        this.potencia = potencia;                                //per tots els objectes de la classe

    }

    //GETTER
    public String getModel() {
        return Cotxe.model;
    }

    public String getMarca() {
        return Cotxe.marca;
    }

    public int getPotencia() {
        return this.potencia;
    }

    //SETTER

    public void setModel(String model) {
        Cotxe.model = model;
    }

    //ToString
    public String toString() {
        return "Cotxe: " + Cotxe.marca + " " + Cotxe.model + " de " + this.potencia + " Cv";
    }

    //Metodes Propis
    public String accelerar() {
        return "El vehicle està accelerant";
    }

    public static String frenar() {
        return "El vehicle està frenant";
    }
}

