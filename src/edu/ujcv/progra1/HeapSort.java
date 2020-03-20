package edu.ujcv.progra1;

public class HeapSort implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        heapSort(array);
        long end = System.nanoTime();
        return end - start;
    }
    static void heapSort(int[] arr) {

        armarheap(arr);
        int sizeOfHeap = arr.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            intercambiar(arr, 0, i);
            sizeOfHeap = sizeOfHeap - 1;
            heapify(arr, 0, sizeOfHeap);
        }
    }
    private static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if (left <= size && arr[left] > arr[i]) {
            max = left;
        } else {
            max = i;
        }
        if (right <= size && arr[right] > arr[max]) {
            max = right;
        }
        if (max != i) {
            intercambiar(arr, i, max);
            heapify(arr, max, size);
        }
    }
    private static void armarheap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }
    private static void intercambiar(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
