package Entregaveis;

public class Fibonacci {

    public static void main(String[] args) {
        int termos = 10;
        System.out.println("Os primeiros " + termos + " termos da sequência de Fibonacci são: " + fibonacci(termos));
    }

    public static String fibonacci(int n) {
        int[] resultado = new int[n];
        resultado[0] = 0;
        resultado[1] = 1;
        for (int i = 2; i < n; i++) {
            resultado[i] = resultado[i - 1] + resultado[i - 2];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(resultado[i]);
            if (i < n - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
