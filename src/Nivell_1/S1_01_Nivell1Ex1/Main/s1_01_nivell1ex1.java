package Nivell_1.S1_01_Nivell1Ex1.Main;

import Nivell_1.S1_01_Nivell1Ex1.Modules.Corda;
import Nivell_1.S1_01_Nivell1Ex1.Modules.Instrument;
import Nivell_1.S1_01_Nivell1Ex1.Modules.Percussio;
import Nivell_1.S1_01_Nivell1Ex1.Modules.Vent;

import java.util.ArrayList;


public class s1_01_nivell1ex1 {

    static ArrayList<Instrument> instruments = new ArrayList<>();

    public static void main(String[] args) {
        instruments.add(new Vent("Flauta travessera", 280));
        instruments.add(new Corda("Fender Telecaster", 1800));
        instruments.add(new Percussio("Plat Zydian", 490));

        for(Instrument i : instruments) {
            System.out.println(i.toString() + "\n" +i.tocar());
        }

    }

}

