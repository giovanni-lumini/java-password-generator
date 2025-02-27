package org.lessons.java.security;

//importo lo scanner per leggere gli input dalla console
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // scanner per leggere gli input dalla console
        Scanner input = new Scanner(System.in);

        // nome
        String nome;
        nome = input.nextLine();

        // cognome
        String cognome;
        cognome = input.nextLine();

        // colore preferito
        String colorePreferito;
        colorePreferito = input.nextLine();

        // data di nascita giorno
        int dataNascitaGiorno;
        dataNascitaGiorno = input.nextInt();

        // data di nascita mese
        int dataNascitaMese;
        dataNascitaMese = input.nextInt();

        // data di nascita anno
        int dataNascitaAnno;
        dataNascitaAnno = input.nextInt();

        // somma numeri data di nascita
        int SommaNumDataNascita = dataNascitaGiorno + dataNascitaMese + dataNascitaAnno;
        System.out.println(SommaNumDataNascita);

        // password generata
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + SommaNumDataNascita;
        System.out.println(password);
    }
}
