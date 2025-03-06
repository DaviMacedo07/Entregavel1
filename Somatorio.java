package Entregaveis;

public class Somatorio {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("A soma dos números de 1 até " + numero + " é: " + somatorio(numero));
    }

    public static int somatorio(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
