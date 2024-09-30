package Nivel_2.s1_01_nivell2ex1.main.modules;

public class Telefon {

    private String marca;
    private String model;

    //Constructor

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    //GETTER

    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return this.model;
    }

    //SEETTER

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Metodes propis

    public String trucar(int telNum) {
        return "S'esta trocant al numero: " + telNum + "\n...";
    }
}

