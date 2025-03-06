package Entregaveis;

public class Contagem {
    public static void main(String[] args) {
        int[] dados = {3, 5, 7, 2, 8, 10, 1};
        int n = 6;
        System.out.println("Existem " + contarNumerosNoIntervalo(dados, n) + " números no intervalo entre o primeiro dado e " + n + ".");
    }

    public static int contarNumerosNoIntervalo(int[] arr, int n) {
        int contador = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[0] && arr[i] <= n) {
                contador++;
            }
        }
        return contador;
    }
}
