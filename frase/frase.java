/*Escriure un programa on permeti a l'usuari introducir una frase com a primer par�metre d'entrada i un car�cter (de longitud 1) com a segon par�metre. La sortida ha de mostrar la frase introduida per� amb totes les ocurrencies del car�cter indicat per l'usuari subtituides per "*" */

import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        System.out.print("Caràcter: ");
        String caracter = sc.nextLine();

        if (caracter.length() != 1) {
            System.out.println("La longitud del caràcter ha de ser 1");
        } else if (!frase.contains(caracter)) {
            System.out.println("El caràcter no existeix");
        } else {
            String novaFrase = frase.replaceAll(caracter, "*");
            System.out.println("Sortida: " + novaFrase);
        }
    }
}