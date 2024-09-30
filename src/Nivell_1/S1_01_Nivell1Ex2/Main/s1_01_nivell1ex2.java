package Nivell_1.S1_01_Nivell1Ex2.Main;

import Nivell_1.S1_01_Nivell1Ex2.Modules.Cotxe;

import java.util.ArrayList;

public class s1_01_nivell1ex2 {

    public static void main(String[] args) {

        ArrayList<Cotxe> cotxes = new ArrayList<>();

        cotxes.add(new Cotxe("Juke", 117));
        cotxes.add(new Cotxe("Almera", 130));
        cotxes.add(new Cotxe("micra", 69));
        // al ser static tanto la marca com el modelo, todos los objetos seran de una una marca,
        // declarada en la clase i todos los objectos seran del ultimo modelo declarado en el constructor de la classe,
        // ya que esta variable se comparte para toda  la classe i no por cada objecto por separado
        for (Cotxe cotxe : cotxes) {
            System.out.println(cotxe.toString());
            System.out.println(cotxe.accelerar());
            System.out.println(Cotxe.frenar());
        }

    }

}

