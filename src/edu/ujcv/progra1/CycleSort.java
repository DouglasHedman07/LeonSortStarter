package edu.ujcv.progra1;

public class CycleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        cycleSort(array);
        long end = System.nanoTime();
        return end - start;
    }

    void cycleSort(int[] array) {
        int pos;
        int item;
        int temp;
        for (int cycleStart = 0; cycleStart < array.length - 1; cycleStart++) {
            item = array[cycleStart];
            pos = cycleStart;
            // Find position where we put the item. We basically
            // count all smaller elements on right side of item.
            for (int i = cycleStart + 1; i < array.length; i++) {
                if (array[i] < item)
                    pos++;
            }
            // If item is already in correct position.
            if (pos == cycleStart)
                continue;
            // ignore all duplicate elements
            while (item == array[pos])
                pos++;
            // put the item to it's right position
            if (item != array[pos]) {
                temp = array[pos];
                array[pos] = item;
                item = temp;
            }
            // Rotate rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                // Find position where we put the element
                for (int i = cycleStart + 1; i < array.length; i++) {
                    if (array[i] < item)
                        pos++;
                }
                // ignore all duplicate elements
                while (item == array[pos])
                    pos++;
                // put the item to it's right position
                if (item != array[pos]) {
                    temp = array[pos];
                    array[pos] = item;
                    item = temp;
                }
            }
        }
    }
}
