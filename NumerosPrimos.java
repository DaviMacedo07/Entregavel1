package Entregaveis;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        int numero = 29; //
        if (verificarNumeroPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }

    public static boolean verificarNumeroPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
