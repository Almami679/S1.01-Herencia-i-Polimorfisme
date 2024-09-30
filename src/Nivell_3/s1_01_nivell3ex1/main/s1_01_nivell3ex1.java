package Nivell_3.s1_01_nivell3ex1.main;

import Nivell_3.s1_01_nivell3ex1.modules.*;

import java.util.ArrayList;
import java.util.Scanner;

public class s1_01_nivell3ex1 {

    public static void main(String[] args) {
        ArrayList<Redactor> redactores = new ArrayList<>();
        int opcion = -1;
        String nombreRedactor = "";
        String dni = "";
        String titular = "";
        String club = "";
        String competicion = "";
        String jugador = "";
        int opcion2 = -1;
        Scanner input = new Scanner(System.in);

        while(opcion != 8) {
            System.out.println("------------------------------------------------------\n" +
                               "-------------------PORTAL EL PERIODICO----------------\n" +
                               "------------------------------------------------------\n" +
                               "[1]Introducir Redactor            [2]Eliminar Redactor\n" +
                               "[3]Introducir noticia a Redactor  [4]Eliminar Noticia\n" +
                               "[5]Mostrar todas las              [6]Calcular puntuacion\n" +
                               "   noticias (Por redactor)           de una Noticia\n" +
                               "[7]Calcular precio de Noticia     [8]Salir\n");
            opcion = input.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Que nombre tiene el redactor");
                    input.next();
                    nombreRedactor = input.nextLine();
                    System.out.println("Introduce el DNI de " + nombreRedactor);
                    dni = input.nextLine();
                    redactores.add(new Redactor(nombreRedactor, dni));
                    System.out.println("Redactor " + nombreRedactor + " creado correctamente");
                    break;

                case 2:
                    System.out.println("Que redactor quieres eliminar de la Base de Datos?");
                    for(int redactor = 0; redactor < redactores.size(); redactor++) {
                        System.out.println("[" + (redactor + 1) + "] " + redactores.get(redactor).getNom());
                    }
                    opcion = input.nextInt() - 1;
                    while(opcion > redactores.size() || opcion < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion = input.nextInt();
                    }
                    redactores.remove(opcion);
                    System.out.println("Redactor eliminado correctamente");
                    opcion = -1; //Como cobreescribo todo el rato opcion, tengo que refrescarla para que no rompa
                    break;

                case 3:
                    System.out.println("A que redactor quieres añadir la noticia?");
                    for(int redactor = 0; redactor < redactores.size(); redactor++) {
                        System.out.println("[" + (redactor + 1) + "] " + redactores.get(redactor).getNom());
                    }
                    opcion = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion > redactores.size() || opcion < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion = input.nextInt();
                    }
                    System.out.println("Que tipo de noticia quieres introducir\n" +
                            "[1]Futbol                          [2]Basquet\n" +
                            "[3]Tenis                           [4]Formula 1\n" +
                            "[5]Motociclismo                    [6]Atras\n");
                    opcion2 = input.nextInt();
                    switch(opcion2) { //opcion dos es el tipo de noticia
                        case 1:
                            System.out.println("Cual es el titular de la noticia?");
                            input.next();
                            titular = input.nextLine();
                            System.out.println("De que competicion se trata" +
                                               "[1]Liga de Campeones\n[2]La liga\n[3]Introducir otra");
                            competicion = input.nextLine();
                            if(competicion.equals("1")) {
                                competicion = "la liga de campeones";
                            }
                            else if(competicion.equals("2")) {
                            competicion = "liga";
                            }
                            else {
                                System.out.println("Introduce el nombre de la competicion");
                                competicion = input.nextLine();

                            }
                            System.out.println("De que club habla la noticia?\n" +
                                    "[1]Barça\n[2]Madrid\n[3]Introducir otro");
                            club = input.nextLine();
                            if(club.equals("1")) {
                                club = "barça";
                            }
                            else if(club.equals("2")) {
                                club = "madrid";
                            }
                            else {
                                System.out.println("Introduce el nombre del club");
                                club = input.nextLine();
                            }
                            System.out.println("De que jugador habla la noticia?\n" +
                                    "[1]Ferran Torres\n[2]Benzema\n[3]Introducir otro");
                            jugador = input.nextLine();
                            if(jugador.equals("1")) {
                                jugador = "ferran torres";
                            }
                            else if(jugador.equals("2")) {
                                jugador = "benzema";
                            }
                            else {
                                System.out.println("Introduce el nombre del jugador");
                                jugador = input.nextLine();
                            }

                            redactores.get(opcion).agregarNoticia(new NoticiaFutbol
                                                                (titular, competicion, club, jugador));
                            System.out.println("Noticia de Futbol Agregada al redactor " +
                                    redactores.get(opcion).getNom());
                            break;

                        case 2:
                            System.out.println("Cual es el titular de la noticia?");
                            input.next();
                            titular = input.nextLine();
                            System.out.println("De que competicion se trata" +
                                    "[1]EuroLiga\n[2]ACB\n[3]Introducir otra");
                            competicion = input.nextLine();
                            if(competicion.equals("1")) {
                                competicion = "euroliga";
                            }
                            else if(competicion.equals("2")) {
                                competicion = "acb";
                            }
                            else {
                                System.out.println("Introduce el nombre de la competicion");
                                competicion = input.nextLine();

                            }
                            System.out.println("De que club habla la noticia?\n" +
                                    "[1]Barça\n[2]Madrid\n[3]Introducir otro");
                            club = input.nextLine();
                            if(club.equals("1")) {
                                club = "barça";
                            }
                            else if(club.equals("2")) {
                                club = "madrid";
                            }
                            else {
                                System.out.println("Introduce el nombre del club");
                                club = input.nextLine();
                            }

                            redactores.get(opcion).agregarNoticia(new NoticiaBasquet(
                                    titular, competicion, club));
                            System.out.println("Noticia de Basquet Agregada al redactor " +
                                                                    redactores.get(opcion).getNom());
                            break;
                        case 3:
                            System.out.println("Cual es el titular de la noticia?");
                            input.next();
                            titular = input.nextLine();
                            System.out.println("De que tenistas habla la noticia?\n" +
                                    "[1]Federer\n[2]Nadal\n[3]Djokovic\n[4]introducir otro tenista");
                            club = input.nextLine();
                            if(club.equals("1")) {
                                club = "federer";
                            }
                            else if(club.equals("2")) {
                                club = "nadal";
                            }
                            else if(club.equals("3")) {
                                club = "djokovic";
                            }
                            else {
                                System.out.println("Introduce el nombre del Tenista");
                                club = input.nextLine();
                            }

                            redactores.get(opcion).agregarNoticia(new NoticiaTenis(
                                    titular, club));
                            System.out.println("Noticia de Tenis Agregada al redactor " +
                                    redactores.get(opcion).getNom());
                            break;

                        case 4:
                            System.out.println("Cual es el titular de la noticia?");
                            input.next();
                            titular = input.nextLine();
                            System.out.println("De que escuderia habla la noticia?\n" +
                                    "[1]Ferrari\n[2]Mercedes\n[3]introducir otro tenista");
                            club = input.nextLine();
                            if(club.equals("1")) {
                                club = "ferrari";
                            }
                            else if(club.equals("2")) {
                                club = "mercedes";
                            }

                            else {
                                System.out.println("Introduce el nombre de la escuderia");
                                club = input.nextLine();
                            }

                            redactores.get(opcion).agregarNoticia(new NoticiaF1(
                                    titular, club));
                            System.out.println("Noticia de Formula 1 Agregada al redactor " +
                                    redactores.get(opcion).getNom());
                            break;

                        case 5:
                            System.out.println("Cual es el titular de la noticia?");
                            input.next();
                            titular = input.nextLine();
                            System.out.println("De que equipo habla la noticia?\n" +
                                    "[1]Honda\n[2]Yamaha\n[3]introducir otro tenista");
                            club = input.nextLine();
                            if(club.equals("1")) {
                                club = "honda";
                            }
                            else if(club.equals("2")) {
                                club = "yamaha";
                            }
                            else {
                                System.out.println("Introduce el nombre del equipo");
                                club = input.nextLine();
                            }

                            redactores.get(opcion).agregarNoticia(new NoticiaMotociclismo(
                                    titular, club));
                            System.out.println("Noticia de Motociclismo Agregada al redactor " +
                                    redactores.get(opcion).getNom());
                            break;

                        case 6:
                            break;
                        default:
                            System.out.println("Opcion no disponible");

                    }
                    opcion = -1;
                    opcion2 = -1;
                    break;
                case 4:
                    System.out.println("De que redactor quieres eliminar la noticia?");
                    for(int redactor = 0; redactor < redactores.size(); redactor++) {
                        System.out.println("[" + (redactor + 1) + "] " + redactores.get(redactor).getNom());
                    }
                    opcion = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion > redactores.size() || opcion < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion = input.nextInt();
                    }
                    System.out.println("Que noticia quieres eliminar?");
                    for(int noticia = 0; noticia < redactores.get(opcion).getNoticias().size(); noticia++) {
                        System.out.println("[" + (noticia + 1) + "] " + redactores.get(opcion)
                                                                                    .getNoticias().get(noticia).getTitular());
                    }
                    opcion2 = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion2 > redactores.size() || opcion2 < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion2 = input.nextInt();
                    }
                    redactores.get(opcion).eliminarNoticia(opcion2);
                    opcion = -1;
                    opcion2 = -1;
                    break;
                case 5:
                    System.out.println("De que redactor quieres consultar las noticias?");
                    for(int redactor = 0; redactor < redactores.size(); redactor++) {
                        System.out.println("[" + (redactor + 1) + "] " + redactores.get(redactor).getNom());
                    }
                    opcion = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion > redactores.size() || opcion < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion = input.nextInt() -1;
                    }
                    System.out.println("Noticias del redactor " + redactores.get(opcion).getNom());
                    for(int noticia = 0; noticia < redactores.get(opcion).getNoticias().size(); noticia++) {
                        System.out.println("[" + (noticia + 1) + "] " + redactores.get(opcion)
                                .getNoticias().get(noticia).getTitular());
                    }
                    System.out.println("Presiona cualquier tecla ara continuar");
                    nombreRedactor = input.nextLine();
                    opcion = -1;
                    opcion2 = -1;
                    break;

                case 6:
                    System.out.println("A que redactor pertenece la noticia?");
                    for(int redactor = 0; redactor < redactores.size(); redactor++) {
                        System.out.println("[" + (redactor + 1) + "] " + redactores.get(redactor).getNom());
                    }
                    opcion = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion > redactores.size() || opcion < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion = input.nextInt();
                    }
                    System.out.println("Que noticia quieres consultar la puntuacion?");
                    for(int noticia = 0; noticia < redactores.get(opcion).getNoticias().size(); noticia++) {
                        System.out.println("[" + (noticia + 1) + "] " + redactores.get(opcion)
                                .getNoticias().get(noticia).getTitular());
                    }
                    opcion2 = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion2 > redactores.size() || opcion2 < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion2 = input.nextInt() -1;
                    }
                    System.out.println("La putnuacion es de " +
                            redactores.get(opcion).getNoticias().get(opcion2).calcularPuntuacion());
                    opcion = -1;
                    opcion2 = -1;
                    break;

                case 7:
                    System.out.println("A que redactor pertenece la noticia?");
                    for(int redactor = 0; redactor < redactores.size(); redactor++) {
                        System.out.println("[" + (redactor + 1) + "] " + redactores.get(redactor).getNom());
                    }
                    opcion = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion > redactores.size() || opcion < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion = input.nextInt();
                    }
                    System.out.println("Que noticia quieres consultar la puntuacion?");
                    for(int noticia = 0; noticia < redactores.get(opcion).getNoticias().size(); noticia++) {
                        System.out.println("[" + (noticia + 1) + "] " + redactores.get(opcion)
                                .getNoticias().get(noticia).getTitular());
                    }
                    opcion2 = input.nextInt() - 1; //opcion 1 es la posicion de la lista del redactor al que va la noticia
                    while(opcion2 > redactores.size() || opcion2 < 0) {
                        System.out.println("Opcion fuera de rango");
                        opcion2 = input.nextInt() -1;
                    }
                    System.out.println("El precio es de " +
                            redactores.get(opcion).getNoticias().get(opcion2).calcularPrecio() + " €");
                    opcion = -1;
                    opcion2 = -1;
                    break;

                case 8:
                    System.out.println("Gracias por usar nuestra plataforma");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
    }

}