package Entregaveis;
import java.util.Arrays;
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};
        System.out.println("Array ordenado: " + Arrays.toString(quicksort(arr)));
    }

    public static int[] quicksort(int[] arr) {
        if (arr.length <= 1) return arr;
        int pivot = arr[arr.length - 1];
        int[] left = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] right = Arrays.stream(arr).filter(x -> x >= pivot).toArray();
        return concatenate(quicksort(left), new int[]{pivot}, quicksort(right));
    }

    private static int[] concatenate(int[] left, int[] pivot, int[] right) {
        int[] result = new int[left.length + pivot.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(pivot, 0, result, left.length, pivot.length);
        System.arraycopy(right, 0, result, left.length + pivot.length, right.length);
        return result;
    }
}
