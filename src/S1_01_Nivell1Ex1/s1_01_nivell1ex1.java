package S1_01_Nivell1Ex1;

import java.util.ArrayList;

public class s1_01_nivell1ex1 {

    static ArrayList<Instrument> instruments = new ArrayList<Instrument>();

    public static void main(String[] args) {
        instruments.add(new Vent("Flauta travessera", 280));
        instruments.add(new Corda("Fender Telecaster", 1800));
        instruments.add(new Percussio("Plat Zydian", 490));

        for(Instrument i : instruments) {
            System.out.println(i.toString() + "\n" +i.tocar());
        }

    }

}

