import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void heapSortTest() {
        assertThrows(NullPointerException.class, () -> HeapSort.heapSort(null));

        assertArrayEquals(new int[]{1,2,3,5,6,7,43}, HeapSort.heapSort(new int[] {3,2,1,7,6,43,5}));
        assertArrayEquals(new int[] {5, 5, 5},  HeapSort.heapSort(new int[]{5,5,5}));
        assertArrayEquals(new int[]{-32,-2,-1,0,0,4,5},  HeapSort.heapSort(new int[]{0,5,0,-1,-2,4,-32}));
        assertArrayEquals(new int[] {5}, HeapSort.heapSort(new int[]{5}));
    }
}