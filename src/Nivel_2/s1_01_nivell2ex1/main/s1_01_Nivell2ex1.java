package Nivel_2.s1_01_nivell2ex1.main;

import Nivel_2.s1_01_nivell2ex1.main.modules.Smartphone;

public class s1_01_Nivell2ex1 {

    public static void main(String[] args) {

        Smartphone telefon1 = new Smartphone("Apple", "Iphone 16");

        System.out.println(telefon1.trucar(672457822) + "\n" + telefon1.alarma()
                + "\n" + telefon1.fotografiar());


    }

}
