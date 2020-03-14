package edu.ujcv.progra1;

import java.util.PriorityQueue;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] heapSort(int[] array) {

        PriorityQueue <Integer> queue = new PriorityQueue<>();
        for (Integer i: array) {
            queue.add(i);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.remove();
        }
        return array;
    }

}
