package edu.ujcv.progra1;

public class CycleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        cycleSort(array);
        long end = System.nanoTime();
        return end - start;
    }

    public void cycleSort(int[] array) {
        int pos;
        int item;
        int temp;

        for (int cycleStart = 0; cycleStart < array.length - 1; cycleStart++) {
            item = array[cycleStart];
            pos = cycleStart;

            for (int i = cycleStart + 1; i < array.length; i++) {
                if (array[i] < item)
                    pos++;
            }
            if (pos == cycleStart)
                continue;
            while (item == array[pos])
                pos++;
            if (item != array[pos]) {
                temp = array[pos];
                array[pos] = item;
                item = temp;
            }

            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < array.length; i++) {
                    if (array[i] < item)
                        pos++;
                }
                while (item == array[pos])
                    pos++;
                if (item != array[pos]) {
                    temp = array[pos];
                    array[pos] = item;
                    item = temp;
                }
            }
        }
    }
}
