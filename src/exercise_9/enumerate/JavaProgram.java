package exercise_9.enumerate;

import java.util.Scanner;

/**
 * Cetiri stadnardna simbola u kartama su TREF, KARO, HERC, PIK.
 * Potreno je da napravimo program koji ce korisniku da omoguci da unese naziv simbola a da zauzvrat dobije njegov simbol.
 * Prilikom reazlizacije programa je potrebno koristiti enumeracije.
 */


public class JavaProgram {

    enum Symbol{
        DIAMOND, CLUB, HEART, SPADE
    }

    public static void main(String[] args) {

        for(Symbol symbol : Symbol.values()){
            System.out.println(symbol + ":" + symbol.ordinal());
        }
        System.out.println();

        System.out.println("Please, enter card symbol: ");
        try (Scanner sc = new Scanner(System.in)) {

            Symbol symbol = Symbol.valueOf(Symbol.class, sc.next().toUpperCase());
            System.out.println(symbol);

            switch (symbol){
                case DIAMOND -> System.out.println("\u2666");// \
                case CLUB -> System.out.println("\u2663");   //  \
                                                             //   -> UNICODE
                case HEART -> System.out.println("\u2665");  //  /
                case SPADE -> System.out.println("\u2660");  // /
            }
        } catch (Exception exc) {
            System.out.println("There is an error.");
        }
    }

}
