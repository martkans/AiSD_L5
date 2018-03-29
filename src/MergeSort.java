public class MergeSort {
    public static int[] mergeSort(int T[]){
        if (T == null) throw new NullPointerException();
        return mergeSort(T, 0, T.length-1);
    }

    private static int[] mergeSort(int T[], int begin, int end){
        if (begin < end){
            int mid = begin + (end - begin)/2;

            mergeSort(T, begin, mid);
            mergeSort(T, mid + 1, end);

            merge(T, begin, mid, end);
        }
        return T;
    }

    private static void merge(int T[], int begin, int mid, int end){
        int[] tab1 = new int[mid - begin + 1];
        int[] tab2 = new int[end - mid];

        for (int i = 0; i < tab1.length; i++)
            tab1[i] = T[begin + i];

        for (int i = 0; i < tab2.length; i++)
            tab2[i] = T[mid + 1 + i];

        int index_tab1 = 0, index_tab2 = 0;
        for (int i = begin; i <= end; i++){
            if (index_tab1 >= tab1.length)
                T[i] = tab2[index_tab2++];
            else if(index_tab2 >= tab2.length)
                T[i] = tab1[index_tab1++];
            else if (tab1[index_tab1] < tab2[index_tab2])
                T[i] = tab1[index_tab1++];
            else
                T[i] = tab2[index_tab2++];
        }
    }
}
