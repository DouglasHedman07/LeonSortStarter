package edu.ujcv.progra1;

public class CycleSort {
    public static void main(String[] args)
    {
        int[] array1 = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
        int[] array2 = {2, 1, 5, 2, 9, 1, 2, 3, 3, 4, 4, 5, 6, 7, 8};

        CycleSort sorter = new CycleSort();
        sorter.cycleSort(array1);
        sorter.cycleSort(array2);

        System.out.println(java.util.Arrays.toString(array1));
        System.out.println(java.util.Arrays.toString(array2));
    }

    void cycleSort(int[] array)
    {
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++)
        {
            int item = array[currentIndex];

            int currentIndexCopy = currentIndex;

            for (int i = currentIndex + 1; i < array.length; i++)
                if (array[i] < item)
                    currentIndexCopy++;
            if (currentIndexCopy == currentIndex)
                continue;

            while (item == array[currentIndexCopy])
                currentIndexCopy++;
            int temp = array[currentIndexCopy];
            array[currentIndexCopy] = item;
            item = temp;

            while (currentIndexCopy != currentIndex) {

                currentIndexCopy = currentIndex;

                for (int i = currentIndex + 1; i < array.length; i++)
                    if (array[i] < item)
                        currentIndexCopy++;

                while (item == array[currentIndexCopy])
                    currentIndexCopy++;

                temp = array[currentIndexCopy];
                array[currentIndexCopy] = item;
                item = temp;
            }
        }
    }
}