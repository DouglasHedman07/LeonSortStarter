package edu.ujcv.progra1;

class BubbleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        bubbleSort(array);
        long end = System.nanoTime();
        return end - start;
    }

    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
