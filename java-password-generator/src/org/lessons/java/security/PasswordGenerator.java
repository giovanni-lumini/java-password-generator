package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
        // nome, cognome, colore preferito, data di nascita
        String nome = "Giovanni";
        String cognome = "Lumini";
        String colorePreferito = "Rosso";
        int dataNascitaGiorno = 15;
        int dataNascitaMese = 1;
        int dataNascitaAnno = 1997;

        int SommaNumDataNascita = dataNascitaGiorno + dataNascitaMese + dataNascitaAnno;
        /* System.out.println(SommaNumDataNascita); */

        System.out.println(nome + "-" + cognome + "-" + colorePreferito + "-" + SommaNumDataNascita);
    }
}
