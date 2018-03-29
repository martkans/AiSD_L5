public class HeapSort {

    public static int[] heapSort(int T[]) {
        if (T == null) throw new NullPointerException();

        for (int i = (T.length/2) - 1; i >= 0; i--)
            heap(T, T.length, i);

        int i = T.length - 1;
        while (i >= 0){
            int temp = T[0];
            T[0] = T[i];
            T[i] = temp;
            heap(T, i, 0);
            i--;
        }
        return T;
    }

    private static void heap(int T[], int size, int root){
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        int max = root;

        if(left < size && T[left] > T[max])
            max = left;

        if (right < size && T[right] > T[max])
            max = right;

        if (max != root){
            int temp = T[root];
            T[root] = T[max];
            T[max] = temp;

            heap(T, size, max);
        }
    }
}
