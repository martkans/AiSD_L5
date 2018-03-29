import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @org.junit.jupiter.api.Test
    void mergeSort() {
        assertThrows(NullPointerException.class, () -> MergeSort.mergeSort(null));

        assertArrayEquals(new int[]{1,2,3,5,6,7,43}, MergeSort.mergeSort(new int[] {3,2,1,7,6,43,5}));
        assertArrayEquals(new int[] {5, 5, 5}, MergeSort.mergeSort(new int[]{5,5,5}));
        assertArrayEquals(new int[]{-32,-2,-1,0,0,4,5}, MergeSort.mergeSort(new int[]{0,5,0,-1,-2,4,-32}));
        assertArrayEquals(new int[] {5}, MergeSort.mergeSort(new int[]{5}));
    }
}