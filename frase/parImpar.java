/*Escriure un programa que pasem com a parametre d’entrada (num1, num2, num3), separats per comes, i la sortida ens mostri la suma dels 3 números i si es parell o imparell.

		Exemple d’execució:
			Entrada: 44, 64, 12
			Sortida: 120 es parell
*/

public class Suma {
    public static void main(String[] args) {
        int num1 = 44;
        int num2 = 64;
        int num3 = 12;
        
        int sum = num1 + num2 + num3;
        String parity = sum % 2 == 0 ? "par" : "impar";
        
        System.out.println(sum + " es " + parity);
    }
}