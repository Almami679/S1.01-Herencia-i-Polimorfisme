package Nivell_3.s1_01_nivell3ex1.modules;

import java.util.ArrayList;

public class Redactor {

    private String nom;
    final private String dni;
    private int sou = 1500;
    private ArrayList<Noticia> noticias;

    //Constructor
    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.noticias = new ArrayList<>();
    }

    //Getters

    public String getNom() {
        return this.nom;
    }

    public String getDni() {
        return this.dni;
    }

    public int getSou() {
        return this.sou;
    }

    public ArrayList<Noticia> getNoticias() {
        return this.noticias;
    }

    //Seeters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSou (int sou) {
        this.sou = sou;
    }

    //Metodos propios

    public void agregarNoticia(Noticia noticia) {
        this.noticias.add(noticia);
    }

    public void eliminarNoticia(int posicion) {
        this.noticias.remove(posicion);
    }

}
