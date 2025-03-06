package Entregaveis;

public class MaximoDivisorComum {

    public static void main(String[] args) {
        int a = 33, b = 66;
        System.out.println("O MDC de " + a + " e " + b + " é: " + mdc(a, b));
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
