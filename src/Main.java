public class Main {
    public static void main(String[] args) {
        int T[] = MergeSort.mergeSort(new int[]{7,9,2,1,8,3});
        for (int i:T)
            System.out.print(i + " ");

        System.out.println("\n");
        int R[] = HeapSort.heapSort(new int[]{8,1,2,9,10,4});
        for (int i:R)
            System.out.print(i + " ");
    }
}
